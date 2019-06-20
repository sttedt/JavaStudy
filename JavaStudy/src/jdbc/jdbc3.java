package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		String user = "root";
		String password = "mysql";
		String url = "jdbc:mysql://localhost:3306/java";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("접속완료!");

		String sql = "SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO FROM EMP";

		PreparedStatement stmt = con.prepareStatement(sql);

		// 4. SQL 실행
		ResultSet rs = stmt.executeQuery(); // DB 값(행) 반환

		
		while(rs.next()) {
		String EMPNO = rs.getString("EMPNO");
		String ENAME = rs.getString("ENAME");
		String JOB = rs.getString("JOB");
		String MGR = rs.getString("MGR");
		String HIREDATE = rs.getString("HIREDATE");
		String SAL = rs.getString("SAL");
		String COMM = rs.getString("COMM");
		String DEPTNO = rs.getString("DEPTNO");
		
		System.out.printf("%s %s %s %s %s %s %s %s", EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO + "\n");
		}

		System.out.println("실행완료");
	}
}
