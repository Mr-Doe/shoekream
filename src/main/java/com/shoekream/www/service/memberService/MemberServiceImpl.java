package com.shoekream.www.service.memberService;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.shoekream.www.domain.memberVO.MemberVO;
import com.shoekream.www.repository.memberDAO.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDAO mdao;

	@Override
	public int register(MemberVO memberVO) {
		int isUp = mdao.insert(memberVO);
		return isUp;
	}

	@Override
	public MemberVO login(MemberVO memberVO) {
		return mdao.selectOne(memberVO);
	}

	@Override
	public List<MemberVO> getList() {
		return mdao.selectList();
	}

	@Override
	public MemberVO getDetail(String email) {
		return mdao.selectDetail(email);
	}

	@Override
	public int modify(MemberVO memberVO) {
		return mdao.update(memberVO);
	}

	@Override
	public int remove(String email) {
		return mdao.delete(email);
	}

	@Override
	public int dupleCheck(String email) {
		return mdao.selectEmail(email);
	}


	/**
	 * Author : Mr.doe
	 * @param email
	 * @return "abc@.abc.com", "qwe@qwe.com" ...
	 */
	@Override
	public String getFollowersList(String email) {
		return mdao.selectFollwers(email);
	}

}
