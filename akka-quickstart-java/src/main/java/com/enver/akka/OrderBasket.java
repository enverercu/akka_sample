package com.enver.akka;

public class OrderBasket {
	
	private int itemId;
	private String itemName;
	private int itemCount;
	
	public OrderBasket(){
		
	}
	
	public OrderBasket(int itemId, String itemName, int itemCount) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemCount = itemCount;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
	
}