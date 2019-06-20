package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		String user = "root";
		String password = "mysql";
		String url = "jdbc:mysql://localhost:3306/java";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("접속완료!");

		// sql 문장 실행준비

		String sql = "SELECT ID , PW , NAME FROM MEMBER";
		PreparedStatement stmt = con.prepareStatement(sql);

		// sql 실행
		ResultSet rs = stmt.executeQuery();
		rs.next();
		String id = rs.getString("ID");
		String pw = rs.getString("PW");
		String name = rs.getString("NAME");
		System.out.printf("%s %s %s", id, pw, name);

		System.out.println("실행완료");
	}
}
