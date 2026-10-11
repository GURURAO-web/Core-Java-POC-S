package com.collection.productmanagementsystem;

public class Products {
	
	private	int ProductId;
	private	String ProductName;
	private	String Category;
	private	double Price;
		
	public void setProductId(int pid) {
		this.ProductId=pid;
	}
	
	public int getProductId() {
		return ProductId;
	}
	
	public void setProductName(String pname) {
		this.ProductName=pname;
	}
	
	public String getProductName() {
		return ProductName;
	}
	
	public void setCategory(String category) {
		this.Category=category;
	}
	public String getCategory() {
		return Category;
	}
	
	public void setPrice(double price) {
		this.Price=price;
	}
	public double getPrice() {
		return Price;
	}
	
	public Products() {
		
	}
	
	public Products(int productid,String productname, String category,double price) {
		this.ProductId=productid;
		this.ProductName=productname;
		this.Category=category;
		this.Price=price;
	}
	
	@Override
	public String toString() {
		return "Product id : " + ProductId + ",name :" +ProductName +", cateogry : " + Category + ",price :" + Price;
	}
	
	
		
	

}
