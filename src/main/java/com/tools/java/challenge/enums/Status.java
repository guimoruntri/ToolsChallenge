package com.tools.java.challenge.enums;

public enum Status {

	AUTORIZADO(1,"AUTORIZADO"),
	NEGADO(2, "NEGADO");

	private int cod;
	private String status;
	
	Status(int cod, String status) {
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
	
	public static Status toEnum(Integer cod) {
		if(cod==null) {
			return null;
		}
		for(Status pagto : Status.values()) {
			if(cod.equals(pagto.getCod())) {
				return pagto;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
