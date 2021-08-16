package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.dto.OrderProjectDTO;
import model.util.DBUtil;

public class OrdererDAO {
	// 꽃의 이름으로 해당 주문 모든 정보 검색
	public static OrderProjectDTO getOrder(String flowerType) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		OrderProjectDTO order = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from order_project WHERE FLOWERTYPE = ?");
			pstmt.setString(1, flowerType);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				order = new OrderProjectDTO(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4),
						rset.getString(5), rset.getString(6), rset.getString(7), rset.getString(8), rset.getString(9),
						rset.getString(10), rset.getString(11));
			}
		} catch (SQLException s) {
			s.printStackTrace();
			throw s;
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return order;
	}
}
