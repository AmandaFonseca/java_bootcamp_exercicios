package com.amanda.cursoJava.aula75;

import java.util.Objects;

public class Produto {
    private String sku;
    private String nome;
    
	public Produto(String sku, String nome) {
		super();
		this.sku = sku;
		this.nome = nome;
	}



	@Override
	public int hashCode() {
		return Objects.hash(nome, sku);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(sku, other.sku);
	}
	
	
}
