package model;

public class Anuncio {
	private Carro carro;
	private double valorAnunciado;

	public Anuncio(Carro c, double vA) {
		if (c == null) {
			System.out.println("Carro não pode ser nulo.");
		} else {
			carro = c;
			valorAnunciado = vA;
		}
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		if (carro == null) {
			System.out.println("Carro não pode ser nulo.");
		} else {
			this.carro = carro;
		}
	}

	public double getValorAnunciado() {
		return valorAnunciado;
	}

	public void setValorAnunciado(double valorAnunciado) {
		this.valorAnunciado = valorAnunciado;
	}

	public String toString() {
		return "Carro " + carro + ", o valorAnunciado " + valorAnunciado;  
	}
	}

	/* Usage example

	Carro car = new Carro("Fusca", "VW", "Conversível", "Esportivo", "300.000");
	Anuncio anuncio = new Anuncio(car, 15000);
	System.out.println(anuncio);

	Anuncio anuncio2 = new Anuncio(null, 15000); // this will print "Carro não pode ser nulo."

	anuncio.setCarro(null); // this will print "Carro não pode ser nulo."

	*/

