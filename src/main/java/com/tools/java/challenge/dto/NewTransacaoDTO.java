package com.tools.java.challenge.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tools.java.challenge.domain.FormaDePagamento;

public class NewTransacaoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "Por favor, digite o id")
	private Integer id;
	@NotNull(message = "Por favor, digite o número do cartão")
	private Long numeroCartao;
	@JsonProperty("descricao")
	private NewDescricaoDTO descricao;
	@JsonProperty("formaPagamento")
	private FormaDePagamento formaDePagamento;
	
	public NewTransacaoDTO() {}
	
	public NewTransacaoDTO(Integer id, Long numeroCartao, NewDescricaoDTO descricao, FormaDePagamento formaDePagamento) {
		this.id = id;
		this.numeroCartao = numeroCartao;
		this.descricao = descricao;
		this.formaDePagamento = formaDePagamento;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(Long numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	@Valid
	public NewDescricaoDTO getNewDescricaoDTO() {
		return descricao;
	}

	public void setNewDescricaoDTO(NewDescricaoDTO descricao) {
		this.descricao = descricao;
	}
	@Valid
	public FormaDePagamento getFormaPagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewTransacaoDTO other = (NewTransacaoDTO) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NewTransacaoDTO [id=");
		builder.append(id);
		builder.append(", numeroCartao=");
		builder.append(numeroCartao);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", formaPagamento=");
		builder.append(formaDePagamento);
		builder.append("]");
		return builder.toString();
	}
}
