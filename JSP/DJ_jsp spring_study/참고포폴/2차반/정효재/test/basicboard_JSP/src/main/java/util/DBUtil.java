package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static Connection getConnection() {
		// 데이터베이스와 연결상태 관리
		try {
			//String dbURL = "jdbc:mysql://localhost:3306/TUTORIAL?useSSL=false&serverTimezone=UTC";
			String dbURL = "jdbc:mysql://localhost:3306/basicjsp?useUnicode=true&characterEncoding=utf-8";
			String temp = "jdbc:mysql://localhost:3306/basicjsp?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC";

			String dbID = "root";
			String dbPassword = "1234"; //1234
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(dbURL, dbID, dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

//출처:https:// icandooit.tistory.com/104 [i can do "IT"]