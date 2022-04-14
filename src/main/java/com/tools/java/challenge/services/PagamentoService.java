package com.tools.java.challenge.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tools.java.challenge.domain.Descricao;
import com.tools.java.challenge.domain.FormaDePagamento;
import com.tools.java.challenge.domain.Pagamentos;
import com.tools.java.challenge.domain.Transacao;
import com.tools.java.challenge.dto.NewPagamentosDTO;
import com.tools.java.challenge.enums.Status;
import com.tools.java.challenge.exception.NullPointerException;
import com.tools.java.challenge.exception.ObjectNotFoundException;
@Service
public class PagamentoService implements Serializable{

	private static final long serialVersionUID = 1L;

	private List<Pagamentos>    pagamentos = new ArrayList<Pagamentos>();
	private List<Pagamentos> newPagamentos = new ArrayList<Pagamentos>();

	public Pagamentos find(Integer id) {
		if(pagamentos.size() != 0) {
			for(Pagamentos tr : pagamentos) {
				if(tr.getTransacao().getId().equals(id)){
					return tr;
				}
			}
			throw new ObjectNotFoundException("Transação: "+ id + " não localizada, por favor "
					+ "procure uma transação existente");
		}
		throw new NullPointerException("Não existem transações em sistema, por favor, realize uma nova");	
	}
	
	public List<Pagamentos> findAll() {
		if(pagamentos.size() != 0) {
			return pagamentos;
		}
		throw new ObjectNotFoundException("Não existem transações em sistema, por favor, realize uma nova");
	}

	public Pagamentos insert(Pagamentos obj) {
		setNewPagamentos(Arrays.asList(obj));
		setNewPagamentos(pagamentos);
//		pagamentos.add(obj);
		return obj;
	}
	
	public List<Pagamentos> getPagamentos() {
		return pagamentos;
	}
	public void setPagamentos(List<Pagamentos> pagamentos) {
		this.pagamentos = pagamentos;
	}

	public List<Pagamentos> getNewPagamentos() {
		return newPagamentos;
	}

	public void setNewPagamentos(List<Pagamentos> newPagamentos) {
		this.newPagamentos = newPagamentos;
	}

	public Pagamentos fromDto(NewPagamentosDTO obj) {
		Transacao tr   = new Transacao(obj.getNewTransacaoDTO().getId(),obj.getNewTransacaoDTO().getNumeroCartao(),null,obj.getNewTransacaoDTO().getFormaPagamento());
		Descricao desc = new Descricao(obj.getNewTransacaoDTO().getNewDescricaoDTO().getValor(),
									   obj.getNewTransacaoDTO().getNewDescricaoDTO().getDataHora(),
									   obj.getNewTransacaoDTO().getNewDescricaoDTO().getEstabelecimeto(),
									   null,
									   null,
									   Status.AUTORIZADO);
		FormaDePagamento formaPagto = obj.getNewTransacaoDTO().getFormaPagamento();
		tr.setDescricao(desc);
		tr.setFormaDePagamento(formaPagto);
		Pagamentos pagto = new Pagamentos(tr);
		return pagto;
	}
	
}
