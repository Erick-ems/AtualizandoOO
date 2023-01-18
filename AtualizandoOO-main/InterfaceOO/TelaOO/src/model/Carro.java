package model;


public class Carro {
	 private String nome;
	 private String ano;
	 private String marca;
	 private String estilo;
	 private String categoria;
	 private String quilometragem;
	 
	 public Carro() {
		 super();
	 }

	  public Carro( String varNomeCar, String varAno, String varMarca, String varEstilo, String varCategoria,String varQuilometragem) {
	
		  nome = varNomeCar;
		  ano = varAno;
		  marca = varMarca;
		  this.estilo = varEstilo;
		  this.categoria = varCategoria;
		  this.quilometragem = varQuilometragem;

		  
	  }
	  public Carro( String varNomeCar, String varMarca, String varEstilo, String varCategoria,String varQuilometragem) {
			
		  nome = varNomeCar;
		  marca = varMarca;
		  this.estilo = varEstilo;
		  this.categoria = varCategoria;
		  this.quilometragem = varQuilometragem;

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

	  public String getCategoria() {
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
	  
	  public String toString() {	
			return "Carro: " + nome;
		}

	}