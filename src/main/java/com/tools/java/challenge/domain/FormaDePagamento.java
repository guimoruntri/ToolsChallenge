package com.tools.java.challenge.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.tools.java.challenge.enums.FormaPagamento;

public class FormaDePagamento implements Serializable{

	private static final long serialVersionUID = 1L;
	@NotNull(message = "O campo deve ser preenchido")
	private Integer formaPagamento;
	@NotNull(message = "O campo deve ser preenchido")
	private Integer parcelas;
	
	public FormaDePagamento() {}
	
	public FormaDePagamento(FormaPagamento formaPagto, Integer parcelas) {
		this.formaPagamento = formaPagto.getCod();
		this.parcelas = parcelas;
	}

	public FormaPagamento getFormaPagamento() {
		return FormaPagamento.toEnum(formaPagamento);
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento.getCod();
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}
	
	
	
}
