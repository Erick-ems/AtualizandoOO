package controller;

import model.PessoaFisica;
import view.CadastroPessoaFisica;




public class CadastroPessoaFisicaController {
	
	private PessoaFisica model;

	private CadastroPessoaFisica view;
	
	
	public void atualizarModelo() {
        String nome = view.getNome();
        String email = view.getEmail();
        String telefone = view.getTelefone();
        model.atualizarDados(nome, email, telefone);
    }
    
    
    
    
    
    

	public PessoaFisica getModel() {
		return model;
	}

	public void setModel(PessoaFisica model) {
		this.model = model;
	}

	public CadastroPessoaFisica getView() {
		return view;
	}

	public void setView(CadastroPessoaFisica view) {
		this.view = view;
	}
	
	
	
	public CadastroPessoaFisicaController(PessoaFisica model) {
		this.setModel(model);
	}
	
	public CadastroPessoaFisicaController(CadastroPessoaFisica view) {
		this.setView(view);
	}
	
	
	
	
	
	
}