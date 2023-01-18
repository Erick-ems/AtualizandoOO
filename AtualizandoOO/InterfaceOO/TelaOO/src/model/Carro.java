package model;

public class Carro {
	 private int id;
	 private String nome;
	 private int ano;
	 private String marca;
	 private String estilo;
	 private String categoria;
	 private float quilometragem;

	  public Carro(int varId, String varNomeCar, int varAno, String varMarca, String varEstilo, String varCategoria, float varQuilometragem) {
		  
		id = varId;  
	    nome = varNomeCar;
	    ano = varAno;
	    marca = varMarca;
	    estilo = varEstilo;
	    categoria = varCategoria;
	    quilometragem = varQuilometragem;
	  }

	  
	  public int getID() {
		    return id;
		  }
	  public void setID(int id) {
		    this.id = id;
		  }
	  
	  
	  
	  public String getNome() {
	    return nome;
	  }
	  public void setNome(String nome) {
	    this.nome = nome;
	  }


	  public int getAno() {
	    return ano;
	  }
	  public void setAno(int ano) {
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

	  public float getQuilometragem() {
	    return quilometragem;
	  }
	  public void setQuilometragem(float quilometragem) {
	    this.quilometragem = quilometragem;
	  }

	  @Override
	  public String toString(){
		  return "id" + this.id + " Carro " + this.nome + " Ano: " + this.ano + " Marca: " + this.marca + " Quilometragem: " + this.quilometragem + " Categoria: " + this.categoria + " Estilo: " + this.estilo;
	  }
	}