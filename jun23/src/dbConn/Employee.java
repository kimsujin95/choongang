package dbConn;
// 결과 한 줄(레코드)을 저장할 class 입니다.

//enum Gender {
//	M, F
//}

public class Employee {
	private int emp_no;
	private String birth_date, first_name, last_name, hire_date;
	private char gender;
	// 이제 위 필드를 외부에서 보지 못하게 잠가 두겠습니다.
	// 메소드를 만들어서 접근하게 하겠습니다. getter / setter

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
