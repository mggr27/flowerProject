package view;

import controller.OrderController;
import model.dto.OrderProjectDTO;

public class StartView {

	public static void main(String[] args) {

		OrderProjectDTO newOrder = new OrderProjectDTO();
		newOrder.setDatetime("����9��10��");
		newOrder.setFlowerType("������");
		newOrder.setGoodsType("�ɴٹ�");
		newOrder.setPrice("5����");
		newOrder.setOrderName("�����");
		newOrder.setOrderPhone("010-3451-4312");
		newOrder.setOrderMembership("VIP");
		newOrder.setRecipientName("���Ը�");
		newOrder.setRecipientPhone("010-5232-6412");
		newOrder.setAddress("����Ư���� �߱� ������ 5�� 1����");
		newOrder.setRecipientMembership("GOLD");

		System.out.println("*****��� �� ��� �ֹ����� �˻� *****");
		OrderController.getAllOrderProject();

		System.out.println("\n***** ��Į�������� ��̷� ���� �� ��˻� *****");
		OrderController.updateFlowerType("2����", "���");
		EndView.allView(OrderController.getOrderInfo("���"));

		System.out.println("\n***** Ư�� ���� �̸����� �˻� *****");
		EndView.allView(OrderController.getOrderInfo("ȥ��"));

		System.out.println("\n***** �ֹ� �߰� �� ��˻� *****");
		OrderController.insertOrder(newOrder);
		OrderController.getAllOrderProject();

		System.out.println("\n***** Ư�� �������� ���� �� ��˻�");
		OrderController.deleteOrder("����9��10��");
		OrderController.getAllOrderProject();

	}

}
