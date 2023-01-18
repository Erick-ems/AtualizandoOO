package model;


public class Anuncio {
	
	private Carro carro;
	private double valorAnunciado;


	
	public Anuncio(Carro c, double vA) {
		
		carro = c;
		valorAnunciado = vA;

		
	}
	
	
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public double getValorAnunciado() {
		return valorAnunciado;
	}public void setValorAnunciado(double valorAnunciado) {
		this.valorAnunciado = valorAnunciado;
	}
	
	public String toString() {
		return "Carro " + carro + ", o valorAnuncidado " + valorAnunciado;  
	}
	
}
