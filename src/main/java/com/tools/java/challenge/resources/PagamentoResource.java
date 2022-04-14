package com.tools.java.challenge.resources;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tools.java.challenge.domain.Transacao;
import com.tools.java.challenge.services.PagamentoService;

@RestController
@RequestMapping(value = "/pagamento")
public class PagamentoResource  implements Serializable{

	@Autowired
	private PagamentoService pagamentoService;
	
	private static final long serialVersionUID = 1L;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Transacao> find(@PathVariable Integer id){
		Transacao tr = pagamentoService.find(id);
		return ResponseEntity.ok().body(tr);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Transacao>> findAll(){
		List<Transacao> tr = pagamentoService.findAll();
		return ResponseEntity.ok().body(tr);
	}
	
}
