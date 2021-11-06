package com.dev.superior.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dev.superior.dsvendas.dto.SaleSumDto;
import com.dev.superior.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT new com.dev.superior.dsvendas.dto.SaleSumDto(obj.seller, SUM(obj.amount)) "
	       + " FROM Sale AS obj GROUP BY obj.seller")	
	List<SaleSumDto> amountGroupedBySeller();
}
			