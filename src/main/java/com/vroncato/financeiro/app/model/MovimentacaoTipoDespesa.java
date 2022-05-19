package com.vroncato.financeiro.app.model;

public class MovimentacaoTipoDespesa {
	
	private MovimentacaoTipoDespesaFixa despesaFixa;
	private MovimentacaoTipoDespesaVariavel despesaVariavel;
	private MovimentacaoTipoDespesaExtra despesaExtra;
	private MovimentacaoTipoDespesaDiversos despesaDiversos;
	
	public MovimentacaoTipoDespesaFixa getDespesaFixa() {
		return despesaFixa;
	}
	public void setDespesaFixa(MovimentacaoTipoDespesaFixa despesaFixa) {
		this.despesaFixa = despesaFixa;
	}
	public MovimentacaoTipoDespesaVariavel getDespesaVariavel() {
		return despesaVariavel;
	}
	public void setDespesaVariavel(MovimentacaoTipoDespesaVariavel despesaVariavel) {
		this.despesaVariavel = despesaVariavel;
	}
	public MovimentacaoTipoDespesaExtra getDespesaExtra() {
		return despesaExtra;
	}
	public void setDespesaExtra(MovimentacaoTipoDespesaExtra despesaExtra) {
		this.despesaExtra = despesaExtra;
	}
	public MovimentacaoTipoDespesaDiversos getDespesaDiversos() {
		return despesaDiversos;
	}
	public void setDespesaDiversos(MovimentacaoTipoDespesaDiversos despesaDiversos) {
		this.despesaDiversos = despesaDiversos;
	}
	
	

}
