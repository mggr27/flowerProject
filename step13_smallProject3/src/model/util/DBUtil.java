/*고려사항
 * 
 * 1.dbInfo 변수는 DBUtil에서만 사용
 * 2.sql변수는 DAO 즉 외부 클래스에서 사용
 * 
 * 1+2 특징 - 효과적인 코드는 단 한 번 실행 보장: static{}로 구현
 * 2번에 해당하는 sql 정보를 보유한 객체를 DAO에게 제공할 때는 주소값 공유
 * 	-?
 * 
 * 
 */
package model.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil {
	// db의 설정 정보를 보유한 객체
	private static Properties dbInfo = new Properties();

	// 모든 DAO들이 사용하는 sql문장 정보를 보유한 객체
	private static Properties sql = new Properties();

	static {
		try {
			dbInfo.load(new FileInputStream("db.properties"));
			sql.load(new FileInputStream("ordersql.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Properties getSql() {
		return sql;
	}
	
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(dbInfo.getProperty("jdbc.url"), dbInfo.getProperty("jdbc.id"),dbInfo.getProperty("jdbc.pw"));
	}

	// DML용
	public static void close(Connection con, Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (con != null) {
				con.close();
				con = null;
			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	// SELECT용
	public static void close(Connection con, Statement stmt, ResultSet rset) {
		try {
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (con != null) {
				con.close();
				con = null;
			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}
}
