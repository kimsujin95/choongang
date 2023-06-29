package com.poseidon.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.poseidon.db.DBConnection;
import com.poseidon.dto.MemberDTO;

public class MemberDAO {
	// 로그인 하는 메소드
	public MemberDTO login(MemberDTO dto) {
		
		MemberDTO result = new MemberDTO();
		// 접속정보 가져오기
//		DBConnection dbCon = new DBConnection(); 
		Connection conn = null;
		conn = DBConnection.getInstance().getConnection();
		
		String sql = "SELECT * FROM member WHERE mid=" + dto.getMid();
		Statement stmt = null;
		ResultSet rs = null;
		
		
		
		result.setMname("통신되었습니다");
		
		return result;
		
	}
}
