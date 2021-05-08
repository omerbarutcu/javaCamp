package GameBackendJava.Entities;

import GameBackendJava.Abstract.Entity;

public class GameProduct implements Entity{
	
	private int id;
	private String productName;
	private double price;
	
	public GameProduct(int id, String productName, double price) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
