package com.shoekream.www.repository.memberDAO;

import java.util.List;

import com.shoekream.www.domain.memberVO.MemberVO;
import org.apache.ibatis.annotations.Param;

public interface MemberDAO {
	int insert(MemberVO memberVO);
	
	MemberVO selectOne(MemberVO memberVO);

	List<MemberVO> selectList();

	MemberVO selectDetail(String email);

	int update(MemberVO memberVO);

	int delete(String email);
	
	int selectEmail(String email);


	String selectFollwers(String email);

}
