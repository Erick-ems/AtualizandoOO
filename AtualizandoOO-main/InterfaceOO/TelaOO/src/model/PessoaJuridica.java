package model;




public class PessoaJuridica extends Pessoa {
  private String cnpj;
  private String nomeFantasia;


  public PessoaJuridica(String varNomeFantasia, String varCnpj, String varCep, int varTelefone, String varEmail) {
    cnpj = varCnpj;
    nomeFantasia = varNomeFantasia;
    cep = varCep;
    telefone = varTelefone;
    email = varEmail;

  }


  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }


  public String getNomefantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String NomeFantasia) {
    this.nomeFantasia = NomeFantasia;
  }

  @Override
  public String toString(){
	  return "Nome Fantasia: " + this.nomeFantasia + " Cnpj: " + this.cnpj + " Cep: " + this.cep + " Telefone: " + this.telefone + " Email: " + this.email;
  }
}