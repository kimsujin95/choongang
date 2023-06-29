package com.poseidon.dto;

public class MemberDTO {
	// private 필드 변수
	private int mno, mgrade;
	private String mname, mid, mpw, mjoindate;

	// 필드 변수들을 Setter & Getter 메소드 구현
	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public int getMgrade() {
		return mgrade;
	}

	public void setMgrade(int mgrade) {
		this.mgrade = mgrade;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMpw() {
		return mpw;
	}

	public void setMpw(String mpw) {
		this.mpw = mpw;
	}

	public String getMjoindate() {
		return mjoindate;
	}

	public void setMjoindate(String mjoindate) {
		this.mjoindate = mjoindate;
	}

}
