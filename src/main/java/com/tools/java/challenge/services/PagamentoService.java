package com.tools.java.challenge.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import com.tools.java.challenge.domain.Transacao;
@Service
public class PagamentoService implements Serializable{

	private static final long serialVersionUID = 1L;

	private List<Transacao> transacoes = new ArrayList<Transacao>();

	public Transacao find(Integer id) {
		for(Transacao tr : transacoes) {
			if(tr.getId().equals(id)){
				return tr;
			}
		}
		throw new ObjectNotFoundException(id, "Não encontrado");
	}
	public List<Transacao> findAll() {
		if(transacoes.size() != 0) {
			return transacoes;
		}
		throw new ObjectNotFoundException(null,"Lista vazia");
	}
	
	public List<Transacao> getTransacoes() {
		return transacoes;
	}
	public void setTransacoes(List<Transacao> transacoes) {
		this.transacoes = transacoes;
	}
	
}
