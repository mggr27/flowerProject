package controller;

import java.sql.SQLException;

import model.OrderProjectDAO;
import model.OrdererDAO;
import model.dto.OrderProjectDTO;
import view.EndView;

public class OrderController {
	// 모든 주문 검색 로직
	public static void getAllOrderProject() {
		try {
			EndView.projectListView(OrderProjectDAO.getAllOrderProjects());
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("모든 프로젝트 검색시 에러 발생");
		}
	}

	// flowerType 수정
	public static boolean updateFlowerType(String price, String flowerType) {
		boolean result = false;
		try {
			result = OrderProjectDAO.updateOrderInfo(price, flowerType);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("해당 가격으로 꽃의 종류 변경 오류");
		}
		return result;
	}

	// 특정 꽃의 이름으로  검색
	public static OrderProjectDTO getOrderInfo(String orderProjectNams) {
		OrderProjectDTO order = null;
		try {
			order = OrdererDAO.getOrder(orderProjectNams);
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.showError("검색 오류 ");
		}
		return order;
	}

	
	//주문 삭제
	public static boolean deleteOrder(String dateTime) {
		boolean result = false;
		try {
			result = OrderProjectDAO.deleteOrderProject(dateTime);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("주문 삭제 오류");
		}
		return result;
	}
	
	//주문 등록
	public static boolean insertOrder(OrderProjectDTO orderProject) {
		boolean result = false;
		try {
			result = OrderProjectDAO.addOrderProject(orderProject);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("주문 추가 등록 오류");
		}
		return result;
	}

	
	
	
	
}
