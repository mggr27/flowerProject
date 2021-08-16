package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.dto.OrderProjectDTO;
import model.util.DBUtil;

public class OrderProjectDAO {

	// 모든 주문 검색
	public static ArrayList<OrderProjectDTO> getAllOrderProjects() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<OrderProjectDTO> list = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("SELECT * FROM ORDER_PROJECT");
			rset = pstmt.executeQuery();

			list = new ArrayList<OrderProjectDTO>();
			while (rset.next()) {
				list.add(new OrderProjectDTO(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4),
						rset.getString(5), rset.getString(6), rset.getString(7), rset.getString(8), rset.getString(9),
						rset.getString(10), rset.getString(11)));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	}

	// OrderInfo로 주문정보 수정
	public static boolean updateOrderInfo(String price, String flowerType) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();

			pstmt = con.prepareStatement("UPDATE ORDER_PROJECT SET FLOWERTYPE = ? WHERE PRICE = ?");
			pstmt.setString(1, flowerType);
			pstmt.setString(2, price);

			int result = pstmt.executeUpdate();
			if (result == 1) {
				return true;
			}
		} catch (SQLException s) {
			s.printStackTrace();
			throw s;
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}
	
	// 주문 추가 등록(insert)
	public static boolean addOrderProject(OrderProjectDTO orderProject) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("insert into order_project values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			pstmt.setString(1, orderProject.getDatetime());
			pstmt.setString(2, orderProject.getFlowerType());
			pstmt.setString(3, orderProject.getGoodsType());
			pstmt.setString(4, orderProject.getPrice());
			pstmt.setString(5, orderProject.getOrderName());
			pstmt.setString(6, orderProject.getOrderPhone());
			pstmt.setString(7, orderProject.getOrderMembership());
			pstmt.setString(8, orderProject.getRecipientName());
			pstmt.setString(9, orderProject.getRecipientPhone());
			pstmt.setString(10, orderProject.getAddress());
			pstmt.setString(11, orderProject.getRecipientMembership());
			

			int result = pstmt.executeUpdate();

			if (result == 1) {
				System.out.println("저장 성공");
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

	//삭제
	public static boolean deleteOrderProject(String datetime) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("delete from order_project where datetime=?");
			pstmt.setString(1, datetime);
			
			int result = pstmt.executeUpdate();
			if (result == 1) {
				return true;
			}
		} catch (SQLException s) {
			s.printStackTrace();
			throw s;
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

}
