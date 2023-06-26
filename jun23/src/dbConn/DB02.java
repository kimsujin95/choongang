package dbConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DB02 {
	public static void main(String[] args) {

		final String URL = "jdbc:mariadb://localhost:3306/employees";
		final String ID = "root";
		final String PW = "kims0528";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Employee> member = new ArrayList<Employee>();
		
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");

			conn = DriverManager.getConnection(URL, ID, PW);
			stmt = conn.createStatement();
			String sql = "SELECT * FROM employees LIMIT 10";
			rs = stmt.executeQuery(sql);
			

			while (rs.next()) {
				Employee e = new Employee();
//				System.out.println(e);
//				System.out.println(rs.getInt(1));
				e.setEmp_no(rs.getInt("emp_no"));
				e.setBirth_date(rs.getString("birth_date"));
				e.setFirst_name(rs.getString("first_name"));
				e.setLast_name(rs.getString("last_name"));
				e.setGender(rs.getString("gender").charAt(0));
				e.setHire_date(rs.getString("hire_date"));
				member.add(e);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 마지막에 연 것 부터 닫습니다. rs -> stmt -> conn
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		for (Employee employee : member) {
			System.out.printf("%3d   ", employee.getEmp_no());
			System.out.printf("%10s  ", employee.getBirth_date());
			System.out.printf("%-15s  ", employee.getFirst_name());
			System.out.printf("%-15s  ", employee.getLast_name());
			System.out.printf("%2c  ", employee.getGender());
			System.out.printf("%10s\n", employee.getHire_date());
				
			
			
		}
		
	}
}

/*
 * DTO(Data Transfer Object) -> EmployeeDTO (데이터 전송 객체)
 * VO(Value Object) -> 값 객체 
 * DAO(Data Access Object) -> SQL 
 * Connection -> DB접속 정보 -> 싱글턴 패턴
 * 
 *
 * 5팀 문제 : DTO, VO 차이 논문으로 써서....
 * 4팀 문제 : byte에 128을 입력하면 잘못된 값이 나오는 이유
			  @Native public static final int MIN_VALUE = 0x80000000;
 * 3팀 문제 : c언어에서 말하는 포인터란 무엇인가. 
 * 2팀 문제 : IDE 종류에 대해 알아오세요. 
 * 1팀 문제 : 컬랙션에서 capacity. 
 *
 *
 *
 */
 