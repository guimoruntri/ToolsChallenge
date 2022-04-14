package com.tools.java.challenge.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

import com.tools.java.challenge.domain.Transacao;
import com.tools.java.challenge.exception.ObjectNotFoundException;
import com.tools.java.challenge.exception.NullPointerException;
@Service
public class PagamentoService implements Serializable{

	private static final long serialVersionUID = 1L;

	private List<Transacao> transacoes = new ArrayList<Transacao>();

	public Transacao find(Integer id) {
		if(transacoes.size() != 0) {
			for(Transacao tr : transacoes) {
				if(tr.getId().equals(id)){
					return tr;
				}
			}
			throw new ObjectNotFoundException("Transação: "+ id + " não localizada, por favor "
					+ "procure uma transação existente");
		}
		throw new NullPointerException("Não existem transações em sistema, por favor, realize uma nova");	
	}
	public List<Transacao> findAll() {
		if(transacoes.size() != 0) {
			return transacoes;
		}
		throw new ObjectNotFoundException("Não existem transações em sistema, por favor, realize uma nova");
	}
	
	public List<Transacao> getTransacoes() {
		return transacoes;
	}
	public void setTransacoes(List<Transacao> transacoes) {
		this.transacoes = transacoes;
	}
	
}
