package view;

import controller.OrderController;
import model.dto.OrderProjectDTO;

public class StartView {

	public static void main(String[] args) {

		OrderProjectDTO newOrder = new OrderProjectDTO();
		newOrder.setDatetime("오전9시10분");
		newOrder.setFlowerType("은방울꽃");
		newOrder.setGoodsType("꽃다발");
		newOrder.setPrice("5만원");
		newOrder.setOrderName("은방울");
		newOrder.setOrderPhone("010-3451-4312");
		newOrder.setOrderMembership("VIP");
		newOrder.setRecipientName("한입만");
		newOrder.setRecipientPhone("010-5232-6412");
		newOrder.setAddress("서울특별시 중구 만리동 5가 1번지");
		newOrder.setRecipientMembership("GOLD");

		System.out.println("*****모든 꽃 배달 주문정보 검색 *****");
		OrderController.getAllOrderProject();

		System.out.println("\n***** 유칼립투스를 장미로 수정 후 재검색 *****");
		OrderController.updateFlowerType("2만원", "장미");
		EndView.allView(OrderController.getOrderInfo("장미"));

		System.out.println("\n***** 특정 꽃의 이름으로 검색 *****");
		EndView.allView(OrderController.getOrderInfo("혼합"));

		System.out.println("\n***** 주문 추가 후 재검색 *****");
		OrderController.insertOrder(newOrder);
		OrderController.getAllOrderProject();

		System.out.println("\n***** 특정 조건으로 삭제 후 재검색");
		OrderController.deleteOrder("오전9시10분");
		OrderController.getAllOrderProject();

	}

}
