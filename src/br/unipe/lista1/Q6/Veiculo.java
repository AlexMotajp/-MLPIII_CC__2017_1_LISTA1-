package br.unipe.lista1.Q6;

public class Veiculo {
	private String placa, marca, modelo, ano, chassi;
	private int valorKmRodado, kmInicial, kmFinal;
	private double valor_locacao;
	
	Pessoa pessoa = new Pessoa();
	
	public double ValorLocacao(){
		return (kmInicial - kmFinal) * valorKmRodado;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public int getValorKmRodado() {
		return valorKmRodado;
	}

	public void setValorKmRodado(int valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}

	public int getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(int kmInicial) {
		this.kmInicial = kmInicial;
	}

	public int getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(int kmFinal) {
		this.kmFinal = kmFinal;
	}

	public double getValor_locacao() {
		return valor_locacao;
	}

	public void setValor_locacao(double valor_locacao) {
		this.valor_locacao = valor_locacao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
