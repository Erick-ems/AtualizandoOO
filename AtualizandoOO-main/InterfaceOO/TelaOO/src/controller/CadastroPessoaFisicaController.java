package controller;

import view.CadastroPessoaFisica;
import model.PessoaFisica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroPessoaFisicaController implements ActionListener {
	private CadastroPessoaFisica view;
	private PessoaFisica model;

	public CadastroPessoaFisicaController (CadastroPessoaFisica view, PessoaFisica model) {
	    this.view = view;
	    this.model = model;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    String nome = view.getNome();
	    model.setNome(nome);
	    view.setResultado("Nome salvo com sucesso!");
	}
}