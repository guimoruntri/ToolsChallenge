package com.tools.java.challenge.domain;

import java.io.Serializable;
import java.util.Date;

import com.tools.java.challenge.enums.Status;

public class Descricao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Double valor;
	private Date dataHora;
	private String estabelecimeto;
	private Integer nsu;
	private Integer codigoAutorizacao;
	private Status status;
	
	public Descricao() {}
	
	public Descricao(Double valor, Date dataHora, String estabelecimeto, Integer nsu, Integer codigoAutorizacao,
			Status status) {
		this.valor = valor;
		this.dataHora = dataHora;
		this.estabelecimeto = estabelecimeto;
		this.nsu = nsu;
		this.codigoAutorizacao = codigoAutorizacao;
		this.status = status;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	public String getEstabelecimeto() {
		return estabelecimeto;
	}
	public void setEstabelecimeto(String estabelecimeto) {
		this.estabelecimeto = estabelecimeto;
	}
	public Integer getNsu() {
		return nsu;
	}
	public void setNsu(Integer nsu) {
		this.nsu = nsu;
	}
	public Integer getCodigoAutorizacao() {
		return codigoAutorizacao;
	}
	public void setCodigoAutorizacao(Integer codigoAutorizacao) {
		this.codigoAutorizacao = codigoAutorizacao;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
}
