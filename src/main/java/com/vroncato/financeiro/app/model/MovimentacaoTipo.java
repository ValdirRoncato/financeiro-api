package com.vroncato.financeiro.app.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "tab_movimentacao_tipo")
public class MovimentacaoTipo {
	
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

}
