package com.dev.superior.dsvendas.dto;

import java.io.Serializable;

import com.dev.superior.dsvendas.entities.Seller;

public class SaleSuccessDto implements Serializable {
	private static final long serialVersionUID = 1l;

	private String sellerName;
	private Long visited;
	private Long deals;
	
	public SaleSuccessDto() {
	}

	public SaleSuccessDto(Seller seller, Long visited, Long deals) {
		sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}	
}
