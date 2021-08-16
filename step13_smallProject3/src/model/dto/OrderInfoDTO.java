package model.dto;

public class OrderInfoDTO {
	
	private String flowerType;
	private String goodsType;
	private String price;
	
	public OrderInfoDTO(String flowerType, String goodsType, String price) {
		super();
		this.flowerType = flowerType;
		this.goodsType = goodsType;
		this.price = price;
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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("-[주문정보 : ");
		builder.append(flowerType);
		builder.append("*");
		builder.append(goodsType);
		builder.append("*");
		builder.append(price);
		builder.append("]-");
		return builder.toString();
	}
	
	
}
