package com.dev.superior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.superior.dsvendas.dto.SaleDto;
import com.dev.superior.dsvendas.dto.SaleSuccessDto;
import com.dev.superior.dsvendas.dto.SaleSumDto;
import com.dev.superior.dsvendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService saleService;

	@GetMapping
	public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable) {
		Page<SaleDto> listSale = saleService.findAll(pageable);
		return ResponseEntity.ok(listSale);
	}

	@GetMapping(value = "/sum-by-seller")
	public ResponseEntity<List<SaleSumDto>> amountGroupedBySeller() {
		List<SaleSumDto> listSaleSum = saleService.amountGroupedBySeller();
		return ResponseEntity.ok(listSaleSum);
	}

	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDto>> successGroupedBySeller() {
		List<SaleSuccessDto> listSaleSucess = saleService.successGroupedBySeller();
		return ResponseEntity.ok(listSaleSucess);
	}
}
