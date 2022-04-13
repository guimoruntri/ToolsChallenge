package com.tools.java.challenge.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.tools.java.challenge.enums.FormaPagamento;

public class Transacao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private static Integer CONTADOR=1;
	private Integer id;
	private Long numeroCartao;
	private Descricao descricao;
	private Integer formaPagamento;
	
	public Transacao() {}
	
	public Transacao(Integer id, Long numeroCartao, Descricao descricao, FormaPagamento formaPagamento) {
		this.id = count(id);
		this.numeroCartao = numeroCartao;
		this.descricao = descricao;
		this.formaPagamento = formaPagamento.getCod();
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

	public Descricao getDescricao() {
		return descricao;
	}

	public void setDescricao(Descricao descricao) {
		this.descricao = descricao;
	}

	public FormaPagamento getFormaPagamento() {
		return FormaPagamento.toEnum(formaPagamento);
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento.getCod();
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
		builder.append(formaPagamento);
		builder.append("]");
		return builder.toString();
	}
	
	
}
