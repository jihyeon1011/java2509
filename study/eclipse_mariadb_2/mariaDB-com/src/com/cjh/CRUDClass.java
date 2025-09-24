package com.cjh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDClass {

	public CRUDClass() {

		// Create테이블 - create table
		createTable();

		// Read테이블 - select
		selectTable();

		// Update테이블 - update table
		// updateTable();

		// Drop테이블삭제
		dropTable();

		// Delete테이블안에 row삭제 - delete
		// deleteUser();

		// insert
		// insertUser();

	}

	private void dropTable() {
		String sql = "Drop table users";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBconnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			int rows = pstmt.executeUpdate();
			System.out.println(rows + "users 테이블이 삭제되었습니다");	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//깔끔하게 자원 해제
			DBconnection.close(pstmt, conn);
		}
		
	}

	private void insertUser() {
		// TODO Auto-generated method stub

	}

	private void deleteUser() {
		// TODO Auto-generated method stub

	}

	private void updateTable() {
		// TODO Auto-generated method stub

	}

	private void selectTable() {
		String sql = "show tables";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBconnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("---- employees의 데이터베이스내의 테이블들 확인 ----");

			while (rs.next()) {
				// String talName = rs.getString("tables_in_employees");
				String talName2 = rs.getString(1);
				// System.out.println("[" + talName + "--" + talName2 +"]");
				System.out.println("[" + talName2 + "]");
			}
			System.out.println("-----------------------------");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBconnection.close(rs, pstmt, conn);
		}

	}

	private void createTable() {
		String sql = "create table if not exists users(\r\n"
				+ "	id varchar(50),\r\n"
				+ "	name varchar(100)\r\n"
				+ ")";
		Connection conn = null;
		Statement stmt = null;
		
		try {	
			conn = DBconnection.getConnection();
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("users테이블 생성 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBconnection.close(stmt, conn);
			
		}
	}
}
