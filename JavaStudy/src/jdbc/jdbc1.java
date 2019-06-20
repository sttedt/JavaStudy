package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbc1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		String user = "root";
		String password = "mysql";
		String url = "jdbc:mysql://localhost:3306/java";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("접속완료!");

		//sql 문장 실행준비
		
		String sql = "INSERT INTO MEMBER (ID, PW, NAME)";
		sql = sql + "VALUES (?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, "abc1");
		stmt.setString(2, "123");
		stmt.setString(3, "홍길동");
		
		//sql 실행
		stmt.executeUpdate();
		System.out.println("실행완료");
	}
}
