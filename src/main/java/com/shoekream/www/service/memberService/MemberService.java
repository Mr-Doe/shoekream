package com.shoekream.www.service.memberService;

import java.util.List;

import com.shoekream.www.domain.memberVO.MemberVO;

public interface MemberService {
	int register(MemberVO memberVO);

	MemberVO login(MemberVO memberVO);

	List<MemberVO> getList();

	MemberVO getDetail(String email);

	int modify(MemberVO memberVO);

	int remove(String email);

	int dupleCheck(String email);

}
