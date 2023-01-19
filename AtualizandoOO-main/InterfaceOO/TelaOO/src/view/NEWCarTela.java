package view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Controle.ControleDados;

public class NEWCarTela implements ActionListener{
    
    private JLabel labelNome = new JLabel("Nome: ");
    private JTextField valorNome;
    
    
	private static ControleDados dados;
	private int posicao;
	
	private JFrame janela;

    
    public NEWCarTela(ControleDados d, int pos) {
    	
    	posicao = pos;
    	dados = d;
    	
    	
    	janela = new JFrame("Cadastro de Carros");
        janela.setLayout(null);
    	
    	
		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
        valorNome = new JTextField(dados.getCarros()[pos].getNome(), 200);
        
        
        
        
        
        
        
        
        
        this.janela.add(labelNome);
		this.janela.add(valorNome);
        
        
        
        
        janela.setSize(600, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    	
    }
    
    
    
    
    
    
    
    
    public void actionPerformed(ActionEvent e) {}
 
    
    
    
    public static void main(String[] args) {
        new NEWCarTela(dados, 0);
    }
    
    
    
}
