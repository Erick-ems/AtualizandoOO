package Controle;

import model.*;

public class ControleDados {
	
	private Dados d = new Dados();
	
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
		if(!dadosCarros[3].matches("[0-9]+") || !dadosCarros[4].matches("[0-9]+") || 
				!dadosCarros[5].matches("[0-9]+") || !dadosCarros[6].matches("[0-9]+")){
			return false;
		} else {
				Carro c = new Carro(dadosCarros[1], dadosCarros[2],dadosCarros[3],
						dadosCarros[4],dadosCarros[5], dadosCarros[6]);
				d.inserirEditarCarro( c, Integer.parseInt(dadosCarros[0]));
				return true;
		}
	}
	
		
		
	public boolean removerCarro(int i) {
		
		int qtdAnunciados = d.getAnunciados();
		String carroRemovido = d.getCarros()[i].getNome();
		String aux;
		for (int j = 0; j < qtdAnunciados; j++) { 
			aux = d.getAnuncio()[j].getCarro().getNome();
			if(carroRemovido.compareTo(aux) == 0) 
				return false; //n�o � poss�vel remover aluno pois ele est� matriculado em um curso
		}		
		
		
		if(i == (d.getQtdCarros() - 1)) { // O Carro a ser removido est� no final do array
			d.setQtdCarros(d.getQtdCarros() - 1);
			d.getCarros()[d.getQtdCarros()] = null;
			return true;
		} else { // o Carro a ser removido est� no meio do array
			int cont = 0;
			while(d.getCarros()[cont].getNome().compareTo(carroRemovido) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < d.getQtdCarros() - 1; j++) {
				d.getCarros()[j] = null;
				d.getCarros()[j] = d.getCarros()[j+1];
			}
			d.getCarros()[d.getQtdCarros()] = null;
			d.setQtdCarros(d.getQtdCarros() - 1);
			return true;
	
		}
	
	
	}
}	
