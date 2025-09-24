package com.cjh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyMain {
	private static final String URL = "jdbc:mariadb://localhost:3306/employees";
	private static final String USER = "root";
	private static final String PASSWORD = "1234";

	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
			System.out.println("✅ MariaDB 연결 성공!");

			// 예시 쿼리 실행
			String sql = "SELECT * FROM employees";
			try (PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {

				System.out.println("test");
			}

		} catch (SQLException e) {
			System.err.println("❌ DB 연결 실패 또는 쿼리 오류:");
			e.printStackTrace();
		}

	}
}
