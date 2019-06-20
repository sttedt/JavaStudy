package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam_Jdbc_2 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String[] title = { "�ǰ���", "������", "����", "����̴�" };
		String[] content = { "Health", "is", "the", "first", "requisite", "to", "success", "in", "life" };

		Class.forName("com.mysql.jdbc.Driver");

		String user = "root";
		String password = "mysql";
		String url = "jdbc:mysql://localhost:3306/java";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("���ӿϷ�!");

		// sql ���� �����غ�
		String sql = "INSERT INTO EX_BOARD";
		sql = sql + " VALUES (?,?,?,now())";
		PreparedStatement stmt = con.prepareStatement(sql);

		Exam_Jdbc_2 e = new Exam_Jdbc_2();

		// sql ����
		for (int i = 1; i <= 100; i++) {
			String t = e.getInputData(title);
			String c = e.getInputData(content);

			stmt.setInt(1, i);
			stmt.setString(2, t);
			stmt.setString(3, c);

			stmt.executeUpdate();

		}
		System.out.println("����Ϸ�");
	}

	private String getInputData(String[] data) {
		// �������� ����
		int num = (int) (Math.random() * data.length);
		return data[num];
	}
}