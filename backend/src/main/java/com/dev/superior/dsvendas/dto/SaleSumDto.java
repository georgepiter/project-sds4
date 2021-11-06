package com.dev.superior.dsvendas.dto;

import java.io.Serializable;

import com.dev.superior.dsvendas.entities.Seller;

public class SaleSumDto implements Serializable {
	
	private String sellerName;
	private Double sum;
	
	public SaleSumDto() {
	}

	public SaleSumDto(Seller seller, Double sum) {
		super();
		this.sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}	
}
