package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaLogin implements ActionListener{

    private JFrame janela;
    private JLabel labelEmail = new JLabel("Email ");
    private JTextField entradaEmail;
    private JLabel labelSenha = new JLabel("Senha ");
    private JTextField entradaSenha;
    private JButton botaoLogar = new JButton("Logar");
    private JButton botaoCadastrar = new JButton("Cadastrar");
    
    
    
    public TelaLogin() {
        janela = new JFrame("Login");
        janela.setLayout(null);

        // Adiciona o Titulo na tela
        janela.add(labelEmail);
        labelEmail.setBounds(180, 90, 120, 25);
        entradaEmail = new JTextField();
        janela.add(entradaEmail);
        entradaEmail.setBounds(180, 120, 220, 25);
        
        
        // Adiciona o Titulo na tela
        janela.add(labelSenha);
        labelSenha.setBounds(180, 190, 120, 25);
        entradaSenha = new JTextField();
        janela.add(entradaSenha);
        entradaSenha.setBounds(180, 220, 220, 25);
        
        
        
        // Adiciona o botao Salvar  
        janela.add(botaoLogar);
        botaoLogar.setBounds(180, 280, 100, 25);
        botaoLogar.addActionListener(this);
        
        
        // Adiciona o botao Salvar  
        janela.add(botaoCadastrar);
        botaoCadastrar.setBounds(300, 280, 100, 25);
        botaoCadastrar.addActionListener(this);
        
        
        
        
            
        
        
        
        // Define as configurações da janela
        janela.setSize(600, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == botaoLogar) {

	        } else if (e.getSource() == botaoCadastrar) {
	        	 new TelaCarro().inserirEditarCarro(this, 0);
	        }
	 }
	
	 public static void main(String[] args) {
	        new TelaLogin();
	    }
}
    
