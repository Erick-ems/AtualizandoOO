package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class TelaPessoaFisica implements ActionListener {

    private JFrame janela;
    private JLabel labelTitulo = new JLabel("DIGITE SEUS DADOS ");
    private JLabel labelNome = new JLabel("Nome: ");
    private JTextField valorNome;
    private JLabel labelIdade = new JLabel("Idade: ");
    private JTextField valorIdade;
    private JLabel labelCpf = new JLabel("Cpf: ");
    private JTextField valorCpf;
    private JLabel labelRg = new JLabel("Rg: ");
    private JTextField valorRg;
    private JLabel labelCep = new JLabel("Cep: ");
    private JTextField valorCep;
    private JLabel labelTelefone = new JLabel("Telefone: ");
    private JTextField valorTelefone;
    private JLabel labelSenha = new JLabel("Senha: ");
    private JTextField valorSenha;
    private JLabel labelEmail = new JLabel("Email: ");
    private JTextField valorEmail;
    private JButton botaoSalvar = new JButton("Salvar");

    public TelaPessoaFisica() {
        janela = new JFrame("Cadastro de Pessoa");
        janela.setLayout(null);

        // Adiciona o Titulo na tela
        janela.add(labelTitulo);
        labelTitulo.setBounds(240, 10, 120, 25);
                
        
        
        // Adiciona o label e o campo de texto para o nome
        janela.add(labelNome);
        labelNome.setBounds(120, 40, 80, 25);
        valorNome = new JTextField();
        janela.add(valorNome);
        valorNome.setBounds(200, 40, 200, 25);

        // Adiciona o label e o campo de texto para a idade
        janela.add(labelIdade);
        labelIdade.setBounds(120, 70, 80, 25);
        valorIdade = new JTextField();
        janela.add(valorIdade);
        valorIdade.setBounds(200, 70, 200, 25);
        
     // Adiciona o label e o campo de texto para a CpF
        janela.add(labelCpf);
        labelCpf.setBounds(120, 100, 80, 25);
        valorCpf = new JTextField();
        janela.add(valorCpf);
        valorCpf.setBounds(200, 100, 200, 25);
        
        // Adiciona o label e o campo de texto para a Rg
        janela.add(labelRg);
        labelRg.setBounds(120, 130, 80, 25);
        valorRg = new JTextField();
        janela.add(valorRg);
        valorRg.setBounds(200, 130, 200, 25);
        
     // Adiciona o label e o campo de texto para a Cep
        janela.add(labelCep);
        labelCep.setBounds(120, 160, 80, 25);
        valorCep = new JTextField();
        janela.add(valorCep);
        valorCep.setBounds(200, 160, 200, 25);
        
     // Adiciona o label e o campo de texto para o Telefone
        janela.add(labelTelefone);
        labelTelefone.setBounds(120, 190, 80, 25);
        valorTelefone = new JTextField();
        janela.add(valorTelefone);
        valorTelefone.setBounds(200, 190, 200, 25);
        
     // Adiciona o label e o campo de texto para o email
        janela.add(labelEmail);
        labelEmail.setBounds(120, 220, 80, 25);
        valorEmail = new JTextField();
        janela.add(valorEmail);
        valorEmail.setBounds(200, 220, 200, 25);
        
        // Adiciona o label e o campo de texto para o senha
        janela.add(labelSenha);
        labelSenha.setBounds(120, 250, 80, 25);
        valorSenha = new JTextField();
        janela.add(valorSenha);
        valorSenha.setBounds(200, 250, 200, 25);
        
     // Adiciona o botao Salvar  
        janela.add(botaoSalvar);
        botaoSalvar.setBounds(200, 300, 200, 25);
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
            String nome = valorNome.getText();
            int idade = Integer.parseInt(valorIdade.getText());
            String cpf = valorCpf.getText();
            String rg = valorRg.getText();
            String cep = valorCep.getText();
            String telefone = valorTelefone.getText();
            String email = valorEmail.getText();
            String senha = valorSenha.getText();
            
            JOptionPane.showMessageDialog(janela, "Nome: " + nome + "\nIdade: " + idade + "\nCpf: " + cpf + "\nRg: " + rg + "\nCep: " + cep + "\nTelefone: " + telefone + "\nEmail: " + email + senha);
            new TelaCatalogo();
            }
    	
    }
    

    public static void main(String[] args) {
        new TelaPessoaFisica();
    }
}