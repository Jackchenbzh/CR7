package jdbc_zhuche;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBUtil {
	
	private static final String URL = "jdbc:mysql://localhost/test";
	private static final String USER = "root";
	private static final String PASSWORD = "cbz8985025";
	
	private static Connection conn = null;
	
	static {
		try {
			//1.加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
					
			//2.获得数据库的连接
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	public static Connection getConnection(){
		return conn;
	}
	
	
}
