package com.tools.java.challenge.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tools.java.challenge.domain.FormaDePagamento;

public class NewTransacaoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private static Integer CONTADOR=1;
	private Integer id;
	private Long numeroCartao;
	@JsonProperty("descricao")
	private NewDescricaoDTO descricao;
	@JsonProperty("formaPagamento")
	private FormaDePagamento formaDePagamento;
	
	public NewTransacaoDTO() {}
	
	public NewTransacaoDTO(Integer id, Long numeroCartao, NewDescricaoDTO descricao, FormaDePagamento formaDePagamento) {
		this.id = count(id);
		this.numeroCartao = numeroCartao;
		this.descricao = descricao;
		this.formaDePagamento = formaDePagamento;
	}
	public Integer count(Integer id) {
		return CONTADOR++;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = count(id);
	}

	public Long getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(Long numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public NewDescricaoDTO getNewDescricaoDTO() {
		return descricao;
	}

	public void setNewDescricaoDTO(NewDescricaoDTO descricao) {
		this.descricao = descricao;
	}

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
