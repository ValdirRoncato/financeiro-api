package com.vroncato.financeiro.app.model;

public class MovimentacaoTipo {
	private MovimentacaoTipoReceita receita;
	private MovimentacaoTipoDespesa despesa;
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
