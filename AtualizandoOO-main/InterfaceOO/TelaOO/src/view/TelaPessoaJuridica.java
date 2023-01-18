package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class TelaPessoaJuridica implements ActionListener {

    private JFrame janela;
    private JLabel labelTitulo = new JLabel("DIGITE SEUS DADOS ");
    private JLabel labelNomeFantasia = new JLabel("Nome Fantasia: ");
    private JTextField valorNomeFantasia;
    private JLabel labelCnpj = new JLabel("Cnpj: ");
    private JTextField valorCnpj;
    private JLabel labelCep = new JLabel("Cep: ");
    private JTextField valorCep;
    private JLabel labelTelefone = new JLabel("Telefone: ");
    private JTextField valorTelefone;
    private JLabel labelEmail = new JLabel("Email: ");
    private JTextField valorEmail;
    private JLabel labelSenha = new JLabel("Senha: ");
    private JTextField valorSenha;
    private JButton botaoSalvar = new JButton("Salvar");

    public TelaPessoaJuridica() {
        janela = new JFrame("Cadastro de Pessoa Juridica");
        janela.setLayout(null);

        // Adiciona o Titulo na tela
        janela.add(labelTitulo);
        labelTitulo.setBounds(240, 10, 120, 25);
                
        
        
        // Adiciona o label e o campo de texto para o nome
        janela.add(labelNomeFantasia);
        labelNomeFantasia.setBounds(110, 40, 100, 25);
        valorNomeFantasia = new JTextField();
        janela.add(valorNomeFantasia);
        valorNomeFantasia.setBounds(200, 40, 200, 25);

        
     // Adiciona o label e o campo de texto para a CpF
        janela.add(labelCnpj);
        labelCnpj.setBounds(110, 70, 80, 25);
        valorCnpj = new JTextField();
        janela.add(valorCnpj);
        valorCnpj.setBounds(200, 70, 200, 25);
        
        
     // Adiciona o label e o campo de texto para a Cep
        janela.add(labelCep);
        labelCep.setBounds(110, 100, 80, 25);
        valorCep = new JTextField();
        janela.add(valorCep);
        valorCep.setBounds(200, 100, 200, 25);
        
     // Adiciona o label e o campo de texto para o Telefone
        janela.add(labelTelefone);
        labelTelefone.setBounds(110, 130, 80, 25);
        valorTelefone = new JTextField();
        janela.add(valorTelefone);
        valorTelefone.setBounds(200, 130, 200, 25);
        
     // Adiciona o label e o campo de texto para o email
        janela.add(labelEmail);
        labelEmail.setBounds(110, 160, 80, 25);
        valorEmail = new JTextField();
        janela.add(valorEmail);
        valorEmail.setBounds(200, 160, 200, 25);
        
        // Adiciona o label e o campo de texto para o email
        janela.add(labelSenha);
        labelSenha.setBounds(110, 190, 80, 25);
        valorSenha = new JTextField();
        janela.add(valorSenha);
        valorSenha.setBounds(200, 190, 200, 25);
        
     // Adiciona o botao Salvar  
        janela.add(botaoSalvar);
        botaoSalvar.setBounds(200, 240, 200, 25);
        botaoSalvar.addActionListener(this);

        // Define as configurações da janela
        janela.setSize(600, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
    	if (e.getSource() == botaoSalvar) {
    		// Aqui é colocar o código para salvar os dados
            // digitados pelo usuário, por exemplo, exibindo-os em um
            // JOptionPane ou salvando-os em um arquivo ou banco de dados
            String nomeFantasia = valorNomeFantasia.getText();
            String cnpj = valorCnpj.getText();
            String cep = valorCep.getText();
            String telefone = valorTelefone.getText();
            String email = valorEmail.getText();
            
            JOptionPane.showMessageDialog(janela, "Nome: " + nomeFantasia + "\nCnpj:" + cnpj + "\nCep:" + cep + "\nTelefone:" + telefone + "\nEmail:" + email);
    }
    	
    }
    

    public static void main(String[] args) {
        new TelaPessoaJuridica();
    }
}