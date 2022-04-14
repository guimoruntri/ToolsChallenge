package com.tools.java.challenge.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NewPagamentosDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	@JsonProperty("transacao")
	private NewTransacaoDTO transacao;

	public NewPagamentosDTO() {}
	
	public NewPagamentosDTO(NewTransacaoDTO transacao) {
		this.transacao = transacao;
	}
	public NewTransacaoDTO getNewTransacaoDTO() {
		return transacao;
	}
	public void setNewTransacaoDTO(NewTransacaoDTO transacao) {
		this.transacao = transacao;
	}
}
