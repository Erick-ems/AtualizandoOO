package model;

public class Dados {

    private Carro[] carros = new Carro[50];
    private int qtdCarros = 0;
    private Anuncio[] anuncio = new Anuncio[50];
    private int anunciados = 0;

    public Carro[] getCarros() {
        return carros;
    }

    public void setCarros(Carro[] carros) {
        this.carros = carros;
    }

    public void inserirEditarCarro(Carro c, int pos) {
        if (pos >= 0 && pos <= 50) {
            if (pos < qtdCarros) {
                this.carros[pos] = c;
            } else if (pos == qtdCarros) {
                if (qtdCarros < 50) {
                    this.carros[pos] = c;
                    qtdCarros++;
                } else {
                    System.out.println("Cannot insert new car, max limit reached.");
                }
            }
        } else {
            System.out.println("Invalid position, cannot insert car.");
        }
    }

    public int getQtdCarros() {
        return qtdCarros;
    }

    public void setQtdCarros(int qtdCarros) {
        if (qtdCarros >= 0 && qtdCarros <= 50) {
            this.qtdCarros = qtdCarros;
        } else {
            System.out.println("Invalid value for quantity of cars.");
        }
    }

    public Anuncio[] getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(Anuncio[] anuncio) {
        this.anuncio = anuncio;
    }

    public int getAnunciados() {
        return anunciados;
    }

    public void setAnunciados(int anunciados) {
        this.anunciados = anunciados;
    }

    public void inserirEditarAnuncio(Anuncio a, int pos) {
        if (pos >= 0 && pos <= 50) {
            if (pos < anunciados) {
                this.anuncio[pos] = a;
            } else if (pos == anunciados) {
                if (anunciados < 50) {
                    this.anuncio[pos] = a;
                    anunciados++;
                } else {
                    System.out.println("Cannot insert new Anuncio, max limit reached.");
                }
            }
        } else {
            System.out.println("Invalid position, cannot insert Anuncio.");
        }
    }
}
