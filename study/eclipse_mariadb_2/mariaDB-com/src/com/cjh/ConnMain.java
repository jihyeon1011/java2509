package com.cjh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnMain {

	public static void main(String[] args) {

		Connection conn = null;
		
		// DB접속정보_기본_conn1
		/*
		 * String url = "jdbc:mariadb://localhost:3306/employees"; String user = "root";
		 * String password = "1234"; Connection conn = null;
		 */

		//conn1 _ 비추천
		/*
		 * try { conn = DriverManager.getConnection(url, user, password);
		 * System.out.println("연결성공");
		 * 
		 * } catch (SQLException e) { e.printStackTrace(); }
		 */
	
		try {
			conn = DBconnection.getConnection();
		} finally {
		//연결해제
		}
		//
		CRUDClass crudClass = new CRUDClass();
	}

}
