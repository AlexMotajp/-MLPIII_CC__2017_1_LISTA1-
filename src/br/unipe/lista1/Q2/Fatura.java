package br.unipe.lista1.Q2;

public class Fatura {
	
	private String numero, descricao;
	private int quantidade;
	private double valor;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValorFatura(){
		double vl;
		
		vl = quantidade * valor;
		
		if (vl < 0)
			vl = 0;
		
		return vl;
	}

}
