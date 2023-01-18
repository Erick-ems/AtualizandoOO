package model;

public abstract class Pessoa {
	  protected String cep;
	  protected int telefone;
	  protected String email;

	  public String getcep() {
	    return cep;
	  }
	  public void setCep(String cep) {
	    this.cep = cep;


	  }public int getTelefone() {
	    return telefone;
	  }
	  public void setTelefone(int telefone) {
	    this.telefone = telefone;


	  }public String getEmail() {
	    return email;
	  }
	  public void setEmail(String email) {
	    this.email = email;


	  }
	}