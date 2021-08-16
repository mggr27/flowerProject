package model.dto;

public class OrderProjectDTO {

	private String datetime;
	private String flowerType;
	private String goodsType;
	private String price;
	private String orderName;
	private String orderPhone;
	private String orderMembership;
	private String recipientName;
	private String recipientPhone;
	private String address;
	private String recipientMembership;

	public OrderProjectDTO(String datetime, String flowerType, String goodsType, String price, String orderName,
			String orderPhone, String orderMembership, String recipientName, String recipientPhone, String address,
			String recipientMembership) {
		super();
		this.datetime = datetime;
		this.flowerType = flowerType;
		this.goodsType = goodsType;
		this.price = price;
		this.orderName = orderName;
		this.orderPhone = orderPhone;
		this.orderMembership = orderMembership;
		this.recipientName = recipientName;
		this.recipientPhone = recipientPhone;
		this.address = address;
		this.recipientMembership = recipientMembership;
	}

	public OrderProjectDTO() {}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getFlowerType() {
		return flowerType;
	}

	public void setFlowerType(String flowerType) {
		this.flowerType = flowerType;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderPhone() {
		return orderPhone;
	}

	public void setOrderPhone(String orderPhone) {
		this.orderPhone = orderPhone;
	}

	public String getOrderMembership() {
		return orderMembership;
	}

	public void setOrderMembership(String orderMembership) {
		this.orderMembership = orderMembership;
	}

	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public String getRecipientPhone() {
		return recipientPhone;
	}

	public void setRecipientPhone(String recipientPhone) {
		this.recipientPhone = recipientPhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRecipientMembership() {
		return recipientMembership;
	}

	public void setRecipientMembership(String recipientMembership) {
		this.recipientMembership = recipientMembership;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("  [주문시간]");
		builder.append(datetime);
		builder.append("  [주문정보]");
		builder.append(flowerType + "-" + goodsType + "-" + price);
		builder.append("  [주문자]");
		builder.append(orderName + "-" + orderPhone + "-" + orderMembership);
		builder.append("  [받는분]");
		builder.append(recipientName + "-" + recipientPhone + "-" + address + "-" + recipientMembership);
		return builder.toString();
	}

}
