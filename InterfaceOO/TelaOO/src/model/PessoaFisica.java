package model;


public class PessoaFisica extends Pessoa {
  private String nome;
  private String cpf;
  private int idade;
  private String rg;

  public PessoaFisica(String varNome, String varCpf, int varIdade, String varRg, String varCep, int varTelefone, String varEmail) {
    nome = varNome;
    cpf = varCpf;
    idade = varIdade;
    rg = varRg;
    cep = varCep;
    telefone = varTelefone;
    email = varEmail;
  }


  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getRg() {
    return rg;
  }
  public void setRg(String rg) {
    this.rg = rg;
  }

  @Override
  public String toString() {
	  return " Pessoa Fisica: " + this.nome + " Cpf: " + this.cpf + " idade: " + this.idade + " rg: " + this.rg + " Cep: " + this.cep + " Telefone: " + this.telefone + " Email: " + this.email;
  }


public void atualizarDados(String nome2, String email, String telefone) {
	// TODO Auto-generated method stub
	
}
}