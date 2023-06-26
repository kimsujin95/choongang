package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	// 데이터베이스 접속 정보를 저장합니다.
	
	public Connection getConn() {

		// Connection 클래스 객체 null 초기화
		Connection conn = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://localhost:3306/employees";
				conn = DriverManager.getConnection(url, "root", "kims0528");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return conn;
	} // 메소드 끝

}
