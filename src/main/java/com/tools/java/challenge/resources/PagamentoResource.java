package com.tools.java.challenge.resources;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tools.java.challenge.domain.Pagamentos;
import com.tools.java.challenge.dto.NewPagamentosDTO;
import com.tools.java.challenge.enums.Status;
import com.tools.java.challenge.services.PagamentoService;

@RestController
@RequestMapping(value = "/pagamento")
public class PagamentoResource  implements Serializable{

	@Autowired
	private PagamentoService pagamentoService;
	
	private static final long serialVersionUID = 1L;


	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public ResponseEntity<Pagamentos> insert(@RequestBody @Valid NewPagamentosDTO objDto){
		Pagamentos pagto = pagamentoService.fromDto(objDto);
		pagto = pagamentoService.insert(pagto);
		return ResponseEntity.ok().body(pagto);
	}
	
	@RequestMapping(value = "consulta/{id}", method = RequestMethod.GET)
	public ResponseEntity<Pagamentos> find(@PathVariable Integer id){
		Pagamentos tr = pagamentoService.find(id);
		return ResponseEntity.ok().body(tr);
	}
	
	@RequestMapping(value ="consulta",method = RequestMethod.GET)
	public ResponseEntity<List<Pagamentos>> findAll(){
		List<Pagamentos> tr = pagamentoService.findAll();
		return ResponseEntity.ok().body(tr);
	}
	
	@RequestMapping(value ="estorno/{id}"	,method = RequestMethod.GET)
	public ResponseEntity<Pagamentos> findEstorno(@PathVariable Integer id){
		Pagamentos tr = pagamentoService.find(id);
		tr.getTransacao().getDescricao().setStatus(Status.NEGADO);
		return ResponseEntity.ok().body(tr);
	}
	
}
