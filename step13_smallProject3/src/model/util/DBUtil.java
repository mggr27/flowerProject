/*�������
 * 
 * 1.dbInfo ������ DBUtil������ ���
 * 2.sql������ DAO �� �ܺ� Ŭ�������� ���
 * 
 * 1+2 Ư¡ - ȿ������ �ڵ�� �� �� �� ���� ����: static{}�� ����
 * 2���� �ش��ϴ� sql ������ ������ ��ü�� DAO���� ������ ���� �ּҰ� ����
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
	// db�� ���� ������ ������ ��ü
	private static Properties dbInfo = new Properties();

	// ��� DAO���� ����ϴ� sql���� ������ ������ ��ü
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

	// DML��
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

	// SELECT��
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
