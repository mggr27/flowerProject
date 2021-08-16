package model.dto;

public class OrdererDTO {
		
	private String orderName;	
	private String phone;
	private String membership;
	
	
	public OrdererDTO(String orderName, String phone, String membership) {
		super();
		this.orderName = orderName;
		this.phone = phone;
		this.membership = membership;
	}


	public String getOrderName() {
		return orderName;
	}


	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getMembership() {
		return membership;
	}


	public void setMembership(String membership) {
		this.membership = membership;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[ÁÖ¹®ÀÚ : ");
		builder.append(orderName);
		builder.append("*");
		builder.append(phone);
		builder.append("*");
		builder.append(membership);
		builder.append("]-");	
		return builder.toString();
	}
	
	
	
	
	
}
