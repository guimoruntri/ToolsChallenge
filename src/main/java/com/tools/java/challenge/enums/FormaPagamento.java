package com.tools.java.challenge.enums;

public enum FormaPagamento {

	AVISTA(1,"A VISTA"),
	PARCELADOLOJA(2, "PARCELADO LOJA"),
	PARCELADOEMISSOR(3,"PARCELADO EMISSOR");

	private int cod;
	private String status;
	
	FormaPagamento(int cod, String status) {
		this.setCod(cod);
		this.setStatus(status);
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public static FormaPagamento toEnum(Integer cod) {
		if(cod==null) {
			return null;
		}
		for(FormaPagamento pagto : FormaPagamento.values()) {
			if(cod.equals(pagto.getCod())) {
				return pagto;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
