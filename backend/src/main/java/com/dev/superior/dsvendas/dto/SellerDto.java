package com.dev.superior.dsvendas.dto;

import java.io.Serializable;

import com.dev.superior.dsvendas.entities.Seller;

public class SellerDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public SellerDto() {		
	}

	public SellerDto(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public SellerDto(Seller seller) {
		id = seller.getId();
		name = seller.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SellerDto [id=" + id + ", name=" + name + "]";
	}
		
}
