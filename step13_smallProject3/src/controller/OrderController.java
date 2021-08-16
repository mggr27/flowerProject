package controller;

import java.sql.SQLException;

import model.OrderProjectDAO;
import model.OrdererDAO;
import model.dto.OrderProjectDTO;
import view.EndView;

public class OrderController {
	// ��� �ֹ� �˻� ����
	public static void getAllOrderProject() {
		try {
			EndView.projectListView(OrderProjectDAO.getAllOrderProjects());
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("��� ������Ʈ �˻��� ���� �߻�");
		}
	}

	// flowerType ����
	public static boolean updateFlowerType(String price, String flowerType) {
		boolean result = false;
		try {
			result = OrderProjectDAO.updateOrderInfo(price, flowerType);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("�ش� �������� ���� ���� ���� ����");
		}
		return result;
	}

	// Ư�� ���� �̸�����  �˻�
	public static OrderProjectDTO getOrderInfo(String orderProjectNams) {
		OrderProjectDTO order = null;
		try {
			order = OrdererDAO.getOrder(orderProjectNams);
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.showError("�˻� ���� ");
		}
		return order;
	}

	
	//�ֹ� ����
	public static boolean deleteOrder(String dateTime) {
		boolean result = false;
		try {
			result = OrderProjectDAO.deleteOrderProject(dateTime);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("�ֹ� ���� ����");
		}
		return result;
	}
	
	//�ֹ� ���
	public static boolean insertOrder(OrderProjectDTO orderProject) {
		boolean result = false;
		try {
			result = OrderProjectDAO.addOrderProject(orderProject);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("�ֹ� �߰� ��� ����");
		}
		return result;
	}

	
	
	
	
}
