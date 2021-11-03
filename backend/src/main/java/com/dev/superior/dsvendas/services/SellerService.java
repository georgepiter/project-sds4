package com.dev.superior.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.superior.dsvendas.dto.SellerDto;
import com.dev.superior.dsvendas.entities.Seller;
import com.dev.superior.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;
	
	public List<SellerDto> findAll() {
		List<Seller> result = sellerRepository.findAll();
		return result.stream().map(SellerDto::new).collect(Collectors.toList());
	}
}
