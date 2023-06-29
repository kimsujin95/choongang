package com.poseidon.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	// 싱글턴화
	public static DBConnection instance = new DBConnection();
	// 생성자 숨김
	private DBConnection() {}
	// 딱 하나 만들어진 인스턴스 호출메소드
	public static DBConnection getInstance() {
		return instance;
	}
	
	
	public Connection getConnection() {
		Connection conn = null;
		
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://localhost:3306/choongang";
			conn = DriverManager.getConnection(url, "흰둥이", "kims0528");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return conn;
	}
}
