package com.tools.java.challenge.enums;

public enum Status {

	PENDENTE(1,"Pagamento Pendente"),
	QUITADO(2, "Pagamento Quitado"),
	CANCELADO(3,"Pagamento Cancelado");

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
	
	public Status toEnum(Integer cod) {
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
