package com.dnstech.couser.entities.enuns;

public enum OrderStatus {

	WAITING_PAYMENT(1), 
	PAID(2), 
	SHIPPED(3), 
	DELIVERD(4), 
	CANCELED(5);
	
	private int code; // campo do codigo do tipo enumerado
	
	private OrderStatus(int code) { //  Definindo construtor private recebendo como argumento o compo int code 
		this.code = code;
	}

	// Definindo um metodo public para acessar esse codigo
	public int getCode() {
		return code;
	}
	
	// Definindo um metodo sataico para converter um valor numerico para o tipo enumeroda
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value: OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Ivalid OrderStatus code: ");
	}
}
