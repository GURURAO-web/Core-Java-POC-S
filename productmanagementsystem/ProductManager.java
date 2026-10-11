package com.collection.productmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager{
	
	private List<Products> products=new ArrayList<>();

	
	public void addProduct(Products product) {
		products.add(product);
		System.out.println("Product added successfully");
	}

	public void displayAllProducts() {
		if(products.isEmpty()) {
			System.out.println("No Products avaliable");
			return;
		}
		
		System.out.println("\n ---- All Products----");
		
		for(Products product:products) {
			System.out.println(product);
		}
	}

	public Products findProductById(int productId) {
		for(Products product:products) {
			
			if(product.getProductId() == productId) {
				return product;
			}
		}
		return null;
	}

	public boolean removeproductbyId(int productId) {
		Products product=findProductById(productId);
		
		if(product !=null) {
			products.remove(product);
		return true;
	}
	return false;
}
	public  void displayAbovePrice(double amount) {
		boolean found=false;
		
		System.out.println("\n ---------- PRODUCTS ABOVE" + amount + "-----------");
		
		for(Products product:products) {
			if(product.getPrice()>amount) {
				System.out.println(product);
				found=true;
			}
		}
		if(!found) {
			System.out.println("No products found");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductManager manager=new ProductManager();
		
		Products p1=new Products(101,"laptop","electronics",45000.00);
		Products p2=new Products(102,"table","furniture",30000.00);
		Products p3=new Products(103,"headset","electronics",1500.00);
		Products p4=new Products(104,"mobile","electronics",50000.00);
		
		manager.addProduct(p1);
		manager.addProduct(p2);
		manager.addProduct(p3);
		manager.addProduct(p4);
		
		manager.displayAllProducts();
		
		System.out.println("\n ------find product ---------");
		
		Products result=manager.findProductById(102);
		
		if(result != null) {
			System.out.println("product found:");
			System.out.println(result);
		} else {
			System.out.println("product not found");
		}
		
		System.out.println("\n ----- remove products------");
		boolean removed=manager.removeproductbyId(103);
		
		if(removed) {
			System.out.println("product removed successfully");
		} else {
			System.out.println("product not found");
		}
		manager.displayAllProducts();
		
		manager.displayAbovePrice(20000);
	}
}