package com.dev.superior.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.superior.dsvendas.dto.SaleDto;
import com.dev.superior.dsvendas.dto.SaleSuccessDto;
import com.dev.superior.dsvendas.dto.SaleSumDto;
import com.dev.superior.dsvendas.entities.Sale;
import com.dev.superior.dsvendas.repositories.SaleRepository;
import com.dev.superior.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDto> findAll(Pageable pageAble) {
		sellerRepository.findAll();
		Page<Sale> result = saleRepository.findAll(pageAble);
		return result.map(SaleDto::new);
	}
	
	@Transactional(readOnly = true)
	public 	List<SaleSumDto> amountGroupedBySeller() {
		return saleRepository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public 	List<SaleSuccessDto> successGroupedBySeller() {
		return saleRepository.successGroupedBySeller();
	}

}
	