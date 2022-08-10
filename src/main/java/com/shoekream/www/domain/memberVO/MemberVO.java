package com.shoekream.www.domain.memberVO;

import org.apache.ibatis.type.Alias;

@Alias("memberVO")
public class MemberVO {
	private String memId;
	private String email;
	private String pwd;
	private String nickName;
	private int grade;
	
	public MemberVO() {}

	// register
	public MemberVO(String email, String pwd, String nickName) {
		this.email = email;
		this.pwd = pwd;
		this.nickName = nickName;
	}

	// login
	public MemberVO(String email, String pwd) {
		this.email = email;
		this.pwd = pwd;
	}

	// list
	public MemberVO(String memId, String email, String nickName, int grade) {
		this.memId = memId;
		this.email = email;
		this.nickName = nickName;
		this.grade = grade;
	}

	// detail, modify
	public MemberVO(String memId, String email, String pwd, String nickName, int grade) {
		this(memId, email, nickName, grade);
		this.pwd = pwd;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
