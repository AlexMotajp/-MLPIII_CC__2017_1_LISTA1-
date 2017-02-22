package br.unipe.lista1.Q5;

public class Fita extends Autor {
	
	private String titulo, categoria;
	private double valor_locacao;
	private Autor autor;
	
	public double ValorLocacao(){
		
		if (this.categoria.equals("infantil")){
			this.valor_locacao -= (this.valor_locacao/40)*100;
		}else{
			this.valor_locacao += (this.valor_locacao/20)*100;
		}
		
		return this.valor_locacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getValor_locacao() {
		return valor_locacao;
	}

	public void setValor_locacao(double valor_locacao) {
		this.valor_locacao = valor_locacao;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

}
