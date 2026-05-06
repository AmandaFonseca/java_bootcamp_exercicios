package com.amanda.cursojava.aula17;

public class Lampada {
	//metodo estatico
	/*Aqui está um resumo direto dos conceitos para facilitar a memorização:
	 * 1. Static vs. Sem Static (Escopo na Memória)
	 * Sem static (Instância): Cada objeto criado tem sua própria cópia do 
	 * atributo. Se você mudar em uma lâmpada, não afeta as outras. 
	 * Gasta mais memória em escala.
	 * Com static (Classe): Existe apenas uma única cópia compartilhada por 
	 * todos os objetos. Alterar o valor em um lugar muda para todas as 
	 * lâmpadas simultaneamente.
	 * 2. Private (Encapsulamento) O que faz: Restringe o acesso ao atributo 
	 * apenas para dentro da própria classe Lampada.
	 * */
	private static String marca = "OUROLUX";
	
	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoLuz;
	private int garantiaMeses;
	private String[] tipos;
	private boolean tipoAbajur;
	private boolean ligada;
	private boolean isLigada() {
		return ligada;
	}

	
	public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, int garantiaMeses,
			String[] tipos, boolean tipoAbajur, boolean ligada) {
		super();
		this.modelo = modelo;
		this.tensao = tensao;
		this.potencia = potencia;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
		this.garantiaMeses = garantiaMeses;
		this.tipos = tipos;
		this.tipoAbajur = tipoAbajur;
		this.ligada = ligada;
	}


	private void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	private boolean isTipoAbajur() {
		return tipoAbajur;
	}
	private void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}
	private String[] getTipos() {
		return tipos;
	}
	private void setTipos(String[] tipos) {
		this.tipos = tipos;
	}
	private int getGarantiaMeses() {
		return garantiaMeses;
	}
	private void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}
	private String getTipoLuz() {
		return tipoLuz;
	}
	private void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}
	private String getCor() {
		return cor;
	}
	private void setCor(String cor) {
		this.cor = cor;
	}
	private int getPotencia() {
		return potencia;
	}
	private void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	private String getTensao() {
		return tensao;
	}
	private void setTensao(String tensao) {
		this.tensao = tensao;
	}
	private String getModelo() {
		return modelo;
	}
	private void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	// Método 1: Liga a lâmpada normalmente
	public void ligar() {
		setLigada(true);
	}
	// Método 2 (SOBRECARGA): Liga a lâmpada com uma intensidade específica
    // Aqui mudamos a assinatura adicionando um parâmetro int
	public void ligar(int potencia) {
		setPotencia(potencia);
		setLigada(true);
		System.out.println("Lâmpada ligada em " + potencia + "%");
	}
	
	// Método 3 (SOBRECARGA): Liga e define se será temporário ou não
    // Mudamos a assinatura usando um boolean
    public void ligar(boolean temporizador) {
        this.ligada = true;
        if (temporizador) {
            System.out.println("Lâmpada ligada: desligará em 5 minutos.");
        }
    }
    
	public void desligar() {
		setLigada(false);
	}


	public void mostrarEstado() {
		if (this.isLigada()) {
			System.out.println("A lâmpada está ligada.");
		}else {
			System.out.println("A lâmpada está desligada.");
		}
		
	}


	public static String getMarca() {
	    return marca;
	}


	private static void setMarca(String marca) {
		Lampada.marca = marca;
	}
}
