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
		System.out.println("���ӿϷ�!");

		// sql ���� �����غ�

		String sql = "SELECT ID , PW , NAME FROM MEMBER";
		PreparedStatement stmt = con.prepareStatement(sql);

		// sql ����
		ResultSet rs = stmt.executeQuery();
		rs.next();
		String id = rs.getString("ID");
		String pw = rs.getString("PW");
		String name = rs.getString("NAME");
		System.out.printf("%s %s %s", id, pw, name);

		System.out.println("����Ϸ�");
	}
}
