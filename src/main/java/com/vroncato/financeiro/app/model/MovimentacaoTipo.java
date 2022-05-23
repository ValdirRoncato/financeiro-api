package com.vroncato.financeiro.app.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_movimentacao_tipo")
public class MovimentacaoTipo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Enumerated(EnumType.STRING)
	private MovimentacaoTipoReceita receita;

	private MovimentacaoTipoDespesa despesa;
	@Enumerated(EnumType.STRING)
	private MovimentacaoTipoInvestimento investimentos;
	
	public MovimentacaoTipoReceita getReceita() {
		return receita;
	}
	public void setReceita(MovimentacaoTipoReceita receita) {
		this.receita = receita;
	}
	public MovimentacaoTipoDespesa getDespesa() {
		return despesa;
	}
	public void setDespesa(MovimentacaoTipoDespesa despesa) {
		this.despesa = despesa;
	}
	public MovimentacaoTipoInvestimento getInvestimento() {
		return investimentos;
	}
	public void setInvestimento(MovimentacaoTipoInvestimento investimento) {
		this.investimentos = investimento;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
