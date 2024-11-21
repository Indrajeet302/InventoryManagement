package com.InventoryManagement.dto;


import java.util.ArrayList;

import org.springframework.context.annotation.Configuration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Configuration
public class Items {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ID;
	private String ItemName;
	private Integer Quantity;
	private Double Price;
	private ArrayList<String> Category ;
	
	public Items(Integer iD, String itemName, Integer quantity, Double price, ArrayList<String> category) {
		super();
		ID = iD;
		ItemName = itemName;
		Quantity = quantity;
		Price = price;
		Category = category;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getItemName() {
		return ItemName;
	}
	
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public Integer getQuantity() {
		return Quantity;
	}
	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public ArrayList<String> getCategory() {
		return Category;
	}
	public void setCategory(ArrayList<String> category) {
		Category = category;
	}
	@Override
	public String toString() {
		return "Items [ItemName=" + ItemName + ", Quantity=" + Quantity + ", Price=" + Price + ", Category=" + Category
				+ "]";
	}
	

	
}
