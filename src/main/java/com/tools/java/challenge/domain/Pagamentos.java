package com.tools.java.challenge.domain;

import java.io.Serializable;

public class Pagamentos implements Serializable{
	private static final long serialVersionUID = 1L;
	private Transacao transacao;

	public Pagamentos() {}
	
	public Pagamentos(Transacao transacao) {
		this.transacao = transacao;
	}

	public Transacao getTransacao() {
		return transacao;
	}

	public void setTransacao(Transacao transacao) {
		this.transacao = transacao;
	}
}
