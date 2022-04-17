package com.tools.java.challenge.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Transacao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotNull
	private Long numeroCartao;
	private Descricao descricao;
	private FormaDePagamento formaDePagamento;
	
	public Transacao() {}
	
	public Transacao(Integer id, Long numeroCartao, Descricao descricao, FormaDePagamento formaDePagamento) {
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

	public Descricao getDescricao() {
		return descricao;
	}

	public void setDescricao(Descricao descricao) {
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
		Transacao other = (Transacao) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Transacao [id=");
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
