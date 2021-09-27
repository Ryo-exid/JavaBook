package moreAPI;

import java.sql.Connection;
import java.sql.DriverManager;

// DBに接続してSQLを送信する
public class DbAndSql {
	public static void main(String[] args) throws Exception {
		Class.forName("org.h2.Driver");
		String dburl = "jdbc:h2:~/test"; // 接続先DBを指定
		String sql = "INSERT INTO EMPLOYEES(name) VALUES('aoki')";
		Connection conn = DriverManager.getConnection(dburl); // DBに接続
		conn.createStatement().executeUpdate(sql); // SQLを送信
		conn.close(); // DBを閉じる
	}
}
