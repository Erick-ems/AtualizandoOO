package model;

import java.util.ArrayList;

public class Carro {
	 private String id;
	 private String nome;
	 private String ano;
	 private String marca;
	 private String estilo;
	 private String categoria;
	 private String quilometragem;

	  public Carro(String varId, String varNomeCar, String varAno, String varMarca, String varEstilo, String varCategoria, String varQuilometragem) {
		  
		this.id = id;  
	    this.nome = nome;
	    this.ano = ano;
	    this.marca = marca;
	    this.estilo = estilo;
	    this.categoria = categoria;
	    this.quilometragem = quilometragem;
	  }

	  
	  public String getID() {
		    return id;
		  }
	  public void setID(String id) {
		    this.id = id;
		  }
	  
	  
	  
	  public String getNome() {
	    return nome;
	  }
	  public void setNome(String nome) {
	    this.nome = nome;
	  }


	  public String getAno() {
	    return ano;
	  }
	  public void setAno(String ano) {
	    this.ano = ano;

	  }

	  public String getMarca() {
	    return marca;
	  }
	  public void setMarca(String marca) {
	    this.marca = marca;
	  }

	  public String getEstilo() {
	    return estilo;
	  }
	  public void setEstilo(String estilo) {
	    this.estilo = estilo;
	  }

	  public String getCategoia() {
	    return categoria;
	  }
	  public void setCategoria(String categoria) {
	    this.categoria = categoria;
	  }

	  public String getQuilometragem() {
	    return quilometragem;
	  }
	  public void setQuilometragem(String quilometragem) {
	    this.quilometragem = quilometragem;
	  }
	  
	  public boolean Persistir(){
	        return true;
	    }

	  public static ArrayList<Carro> getCarro(){
		  ArrayList<Carro> carros = new ArrayList();
		  return carros;
	  }
	}