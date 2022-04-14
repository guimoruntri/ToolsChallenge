package com.tools.java.challenge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.tools.java.challenge.domain.Descricao;
import com.tools.java.challenge.domain.Transacao;
import com.tools.java.challenge.enums.FormaPagamento;
import com.tools.java.challenge.enums.Status;
import com.tools.java.challenge.services.PagamentoService;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class ToolsJavaChallengeApplication implements CommandLineRunner{

	@Autowired
	private PagamentoService pagamentoService;
	
	public static void main(String[] args) throws ParseException {
		SpringApplication.run(ToolsJavaChallengeApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Transacao tr1 = new Transacao(null, (long) 987654321, null, FormaPagamento.AVISTA);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Descricao desc = new Descricao(50.00, sdf.parse("30/09/2017 10:32") , "Pet shop mundo cao", 1234567890, 147258369,Status.AUTORIZADO , tr1);
		tr1.setDescricao(desc);
		
		Transacao tr2 = new Transacao(null, (long) 987654321, null, FormaPagamento.AVISTA);

		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Descricao desc2 = new Descricao(50.00, sdf2.parse("30/09/2017 10:32") , "Pet shop mundo cao", 1234567890, 147258369,Status.AUTORIZADO , tr2);
		
		tr2.setDescricao(desc2);
		
//		pagamentoService.setTransacoes(Arrays.asList(tr1,tr2));
		
	}

}
