package com.vroncato.financeiro.app.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_movimentacao_tipo_despesa")
public class MovimentacaoTipoDespesa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	private MovimentacaoTipoDespesaFixa despesaFixa;
	@Enumerated(EnumType.STRING)
	private MovimentacaoTipoDespesaVariavel despesaVariavel;
	@Enumerated(EnumType.STRING)
	private MovimentacaoTipoDespesaExtra despesaExtra;
	@Enumerated(EnumType.STRING)
	private MovimentacaoTipoDespesaDiversos despesaDiversos;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
