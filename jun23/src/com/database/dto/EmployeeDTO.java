package com.database.dto;
// 데이터 전송객체 : 데이터베이스에서 온 값을 담을 그릇

public class EmployeeDTO {
	// 각 값을 담을 필드를 만들겠습니다.
	// 각 필드는 수정불가 = 외부에서 보지 못하게 해주세요 = get/set
	// 사원번호 	emp_no
	// 생년월일 	birth_name
	// 이름 		first_name
	// 성 			last_name
	// 성별 		gender
	// 입사일 		hire_date
	
	private int emp_no;
	private String birth_date, first_name, last_name, hire_date;
	private char gender;

	// Setter & Getter 메소드 설정
	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getHire_date() {
		return hire_date;
	}

	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}
