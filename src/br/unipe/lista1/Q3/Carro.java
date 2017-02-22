package br.unipe.lista1.Q3;

public class Carro {

	private String cor, modelo;
	private int velocidade_atual, velocidade_maxima;
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade_atual() {
		return velocidade_atual;
	}

	public void setVelocidade_atual(int velocidade_atual) {
		this.velocidade_atual = velocidade_atual;
	}

	public int getVelocidade_maxima() {
		return velocidade_maxima;
	}

	public void setVelocidade_maxima(int velocidade_maxima) {
		this.velocidade_maxima = velocidade_maxima;
	}

	public String ligar(){
		return "Carro Ligado!";
	}
	
	public String acelerar(int velocidade_acrescentar){
		
		String str = null;
		
		if ((this.velocidade_atual + velocidade_acrescentar) > this.velocidade_maxima) {
			str = "Velocidade Máxima Excedida!";
		} else {
			this.velocidade_atual += velocidade_acrescentar;
			str = "Velocidade Atual: " + this.velocidade_atual;
		}
		
		return str;
	}
}
