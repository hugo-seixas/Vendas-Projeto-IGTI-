package com.hugoseixas.vendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hugoseixas.vendas.DTO.RankingComprasDTO;
import com.hugoseixas.vendas.entities.Compras;

public interface ComprasRepository extends JpaRepository<Compras, Integer>{
	@Query("SELECT new com.hugoseixas.vendas.DTO.RankingComprasDTO(compras.cliente, sum(compras.totalCompra)) "
			+ "FROM Compras AS compras GROUP BY compras.cliente ORDER BY sum(compras.totalCompra) DESC")
	List<RankingComprasDTO>findRanking();

}
