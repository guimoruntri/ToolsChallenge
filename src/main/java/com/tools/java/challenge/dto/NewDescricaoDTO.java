package com.tools.java.challenge.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class NewDescricaoDTO  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Double valor;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date dataHora;
	private String estabelecimeto;
	
	public NewDescricaoDTO() {}
	
	public NewDescricaoDTO(Double valor, Date dataHora, String estabelecimeto) {
		this.valor = valor;
		this.dataHora = dataHora;
		this.estabelecimeto = estabelecimeto;
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
}
