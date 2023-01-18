package model;



public class Dados {

	private Carro[] carros = new Carro[50];
	private int qtdCarros = 5;
	private Anuncio[] anuncio = new Anuncio[50];
	private int anunciados = 0;
	

	
	
	public Carro[] getCarros() {
		return carros;
	}
	public void setCarros(Carro[] carros) {
		this.carros = carros;
	}
	
	public void inserirEditarCarro(Carro c, int pos) {
		this.carros[pos] = c;
		if(pos == qtdCarros) qtdCarros++;
	}
	public int getQtdCarros() {
		return qtdCarros;
	}
	public void setQtdCarros(int qtdCarros) {
		this.qtdCarros = qtdCarros;
	}
	public Anuncio[] getAnuncio() {
		return anuncio;
	}public void setAnuncio(Anuncio[] anuncio) {
		this.anuncio = anuncio;
	}public int getAnunciados() {
		return anunciados;
	}public void setAnunciados(int anunciados) {
		this.anunciados = anunciados;
	}
}
