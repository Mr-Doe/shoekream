package com.shoekream.www.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.shoekream.www.domain.memberVO.MemberVO;
import com.shoekream.www.service.memberService.MemberService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/member/*")
public class MemberController {

	private final MemberService msv;
	
	@GetMapping("/buyHistoryDetail")
	public void buyHistoryDetail()	{
		log.info(">>> MemberController > buyHistoryDetail - GET");
	}
	
	@GetMapping("/mypage")
	public void mypage(@RequestParam("email") String email, Model model) {
		log.info(">>> MemberController > MyPage - GET");
		MemberVO memberVO = msv.getDetail(email);
		String initEmail = memberVO.getEmail().substring(0, memberVO.getEmail().lastIndexOf("@"));
		model.addAttribute("memberVO", memberVO);
		model.addAttribute("initEmail", initEmail);
	}

	@GetMapping("/register")
	public void register() {
		log.info(">>> MemberController > Register - GET");
	}

	@PostMapping(value = "/register", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> register(@RequestBody MemberVO memberVO) {
		return msv.register(memberVO) > 0 ? new ResponseEntity<String>("1", HttpStatus.OK)
				: new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@GetMapping("/list")
	public void list(Model model) {
		log.info(">>> MemberController > List - GET");
		List<MemberVO> list = msv.getList();
		model.addAttribute("list", list);
	}

	@GetMapping("/detail")
	public void detail(Model model, @RequestParam("email") String email) {
		log.info(">>> MemberController > Detail - GET");
		MemberVO memberVO = msv.getDetail(email);
		model.addAttribute("memberVO", memberVO);
	}

	@GetMapping("/modify")
	public void modify(Model model, @RequestParam("email") String email) {
		log.info(">>> MemberController > Modify - GET");
		MemberVO memberVO = msv.getDetail(email);
		String initEmail = memberVO.getEmail().substring(0, memberVO.getEmail().lastIndexOf("@"));
		model.addAttribute("memberVO", memberVO);
		model.addAttribute("initEmail", initEmail);
	}

	@PostMapping("/modify")
	public String modify(MemberVO memberVO) {
		int isUp = msv.modify(memberVO);
		log.info(">>> MemberController > Modify - POST : {}", isUp > 0 ? "OK" : "FAIL");
		return "redirect:/member/detail?email=" + memberVO.getEmail();
	}

	@PostMapping("/remove")
	public String remove(HttpSession ses, @RequestParam("email") String email) {
		int isUp = msv.remove(email);
		log.info(">>> MemberController > Remove - POST : {}", isUp > 0 ? "OK" : "FAIL");
		ses.removeAttribute("ses");
		ses.invalidate();
		return "redirect:/";
	}

	@GetMapping("/login")
	public void login() {
		log.info(">>> MemberController > Login - GET");
	}

	@PostMapping(value = "/login", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
	public String login(@RequestBody MemberVO memberVO, HttpSession ses) {
		if (ses.getAttribute("ses") != null) {
			ses.removeAttribute("ses");
		}

		if (msv.login(memberVO) != null) {
			ses.setAttribute("ses", memberVO);
		} else {
			return "redirect:/member/login";
		}
		return "redirect:/";
	}

	@GetMapping("/logout")
	public String logout(HttpSession ses, RedirectAttributes rttr) {
		ses.removeAttribute("ses");
		ses.invalidate();
		rttr.addFlashAttribute("isLogout", 1);
		return "redirect:/";
	}

	@ResponseBody
	@PostMapping(value = "/dupleCheck", consumes = "application/json", produces = { MediaType.TEXT_PLAIN_VALUE })
	public String dupleCheck(@RequestBody HashMap<String, String> map) {
		int isExist = msv.dupleCheck(map.get("email"));
		return isExist > 0 ? "1" : "0";
	}
}
