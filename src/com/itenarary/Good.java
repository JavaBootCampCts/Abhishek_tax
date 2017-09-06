package com.itenarary;

import java.util.List;

public class Good {
	private String name;
	private String category;
	private double price;
	private List<String> applicableTaxes;

	public Good(String name, String category, double price) {
		this.name = name;
		this.category = category;
		this.price = price;
		// this.applicableTaxes = applicableTaxes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<String> getApplicableTaxes() {
		return applicableTaxes;
	}

	public void setApplicableTaxes(List<String> applicableTaxes) {
		this.applicableTaxes = applicableTaxes;
	}
}
