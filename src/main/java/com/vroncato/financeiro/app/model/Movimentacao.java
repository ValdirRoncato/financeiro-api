package com.vroncato.financeiro.app.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Movimentacao {
	
	private Integer id;
	private Date dataOcorrencia;
	private LocalDateTime dataLancamento;
	private String descricao;
	private String descricaoComplementar;
	private Double valor;
	private MovimentacaoTipo tipo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDataOcorrencia() {
		return dataOcorrencia;
	}
	public void setDataOcorrencia(Date dataOcorrencia) {
		this.dataOcorrencia = dataOcorrencia;
	}
	public LocalDateTime getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(LocalDateTime dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricaoComplementar() {
		return descricaoComplementar;
	}
	public void setDescricaoComplementar(String descricaoComplementar) {
		this.descricaoComplementar = descricaoComplementar;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public MovimentacaoTipo getTipo() {
		return tipo;
	}
	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}
	
	

}
