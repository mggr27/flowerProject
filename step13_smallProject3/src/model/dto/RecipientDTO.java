package model.dto;

public class RecipientDTO {

	private String recipientName;
	private String phone;
	private String address;
	private String membership;

	public RecipientDTO(String recipientName, String phone, String address, String membership) {
		super();
		this.recipientName = recipientName;
		this.phone = phone;
		this.address = address;
		this.membership = membership;
	}

	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
		builder.append("[¹Þ´ÂºÐ : ");
		builder.append(recipientName);
		builder.append("*");
		builder.append(phone);
		builder.append("*");
		builder.append(address);
		builder.append("*");
		builder.append(membership);
		builder.append("]");
		return builder.toString();
	}
}
