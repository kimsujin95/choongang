package dbConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 자바와 데이터베이스를 연결하겠습니다.
// 2023-06-23
// 주소URL, ID, PW
public class DB01 {
	public static void main(String[] args) {

//		String url = "jdbc:데이터베이스://IP:포트/디비명";
//		String url = "jdbc:mariadb://127.0.0.1:3306/employees";
		String url = "jdbc:mariadb://localhost:3306/employees";
		String id = "root";
		String pw = "kims0528";
		Connection conn = null;

		try { // 예외 처리
			
			// 데이터를 담을 상자
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pw);
			
			// Statement는 그 상자를 가지고 일을 하는 것이다.
			Statement stmt = conn.createStatement();
			System.out.println("접속 성공");
			ResultSet rs = stmt.executeQuery("SELECT * FROM employees LIMIT 10;");
			
			while (rs.next()) {
				System.out.print(rs.getInt("emp_no"));
				System.out.print(rs.getString("birth_date"));
				System.out.print(rs.getString("first_name"));
				System.out.print(rs.getString("last_name"));
				System.out.print(rs.getString("gender"));
				System.out.println(rs.getString("hire_date"));
			}
			
		} catch (ClassNotFoundException e) {

			System.out.println("접속 객체가 없습니다.");
			e.printStackTrace();

		} catch (SQLException e) {

			System.out.println("접속 정보가 잘못되었습니다.");
			e.printStackTrace();

		} finally {
			try {
				conn.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}
}
