package Controle;

import model.*;

public class ControleDados {
	
	private Dados d = new Dados();
	
	public ControleDados() {
	}
	
	public Dados getDados() {
		return d;
	}
	
	public void setDados(Dados d) {
		this.d = d;
	}
	
	public Carro[] getCarros() {
		return this.d.getCarros();
	}
	
	public int getQtdCarros() {
		return this.d.getQtdCarros();
	}
	
	public boolean inserirEditarCarro(String[] dadosCarros) {
		Carro c = new Carro(dadosCarros[1],dadosCarros[2],dadosCarros[3],
				dadosCarros[4],dadosCarros[5], dadosCarros[6]);
		d.inserirEditarCarro(c, Integer.parseInt(dadosCarros[0]));
		return true;
	}
	
	public boolean removerCarro(int i) {
		
		int qtdAnunciados = d.getAnunciados();
		String carroRemovido = d.getCarros()[i].getNome();
		String aux;
		for (int j = 0; j < qtdAnunciados;j++) {
			aux = d.getAnuncio()[j].getCarro().getNome();
			if(carroRemovido.compareTo(aux) == 0) {
			d.getAnuncio()[j].setCarro(null);
			d.setAnunciados(d.getAnunciados() - 1);
			}
		}
		
		
		if(i == (d.getQtdCarros() - 1)) { 
			d.setQtdCarros(d.getQtdCarros() - 1);
			d.getCarros()[d.getQtdCarros()] = null;
			return true;
		} else { 
			int cont = i;
			while(cont < d.getQtdCarros() - 1) {
				d.getCarros()[cont] = d.getCarros()[cont+1];
				cont++;
			}
			d.getCarros()[d.getQtdCarros() - 1] = null;
			d.setQtdCarros(d.getQtdCarros() - 1);
			return true;
		}
	}
}

	//public class Teste {
		//public static void main(String[] args) {
		//ControleDados c = new ControleDados();
	//	String[] dadosCarros1 = {"0","Ferrari","2020","Ferrari","Esportivo","Luxo","10000"};
	//	String[] dadosCarros2 = {"1","Lamborghini","2022","Lamborghini","Esportivo","Luxo","20000"};
		//String[] dadosCarros3 = {"2","BMW","2021","BMW","Sedan","Luxo","30000"};
		
		//c.inserirEditarCarro(dadosCarros1);
		//c.inserirEditarCarro(dadosCarros2);
		//c.inserirEditarCarro(dadosCarros3);
		
	//	System.out.println("Quantidade de carros antes da remoção: " + c.getQtdCarros());
		
	//	c.removerCarro(1);
		
	//	System.out.println("Quantidade de carros depois da remoção: " + c.getQtdCarros());
		
//		for(int i = 0; i < c.getQtdCarros(); i++) {
	//		System.out.println(c.getCarros()[i].getNome());
	//	}
//	}
//	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
