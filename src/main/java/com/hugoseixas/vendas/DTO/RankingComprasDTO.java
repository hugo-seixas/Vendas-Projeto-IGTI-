package com.hugoseixas.vendas.DTO;

import com.hugoseixas.vendas.entities.Cliente;

public class RankingComprasDTO {
	private String nome;
	private Double valorTotal;
	
	public RankingComprasDTO(Cliente cliente, Double valorTotal) {
		super();
		this.nome = cliente.getNome();
		this.valorTotal = valorTotal;
	}
	
	public RankingComprasDTO() {
	
	}
	
	public String getNomeCliente() {
		return nome;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nome = nomeCliente;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	

}
