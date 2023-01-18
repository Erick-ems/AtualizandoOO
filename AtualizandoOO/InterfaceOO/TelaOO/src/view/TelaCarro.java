package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class TelaCarro implements ActionListener {

    private JFrame janela;
    private JLabel labelTitulo = new JLabel("DIGITE OS DADOS DO VEICULO ");
    private JLabel labelNome = new JLabel("Nome: ");
    private JTextField valorNome;
    private JLabel labelAno = new JLabel("Ano: ");
    private JTextField valorAno;
    private JLabel labelMarca = new JLabel("Marca: ");
    private JTextField valorMarca;
    private JLabel labelEstilo = new JLabel("Estilo: ");
    private JTextField valorEstilo;
    private JLabel labelCategoria = new JLabel("Categoria: ");
    private JTextField valorCategoria;
    private JLabel labelQuilometragem = new JLabel("Quilometragem: ");
    private JTextField valorQuilometragem;
    private JButton botaoSalvar = new JButton("Salvar");

    public TelaCarro() {
        janela = new JFrame("Cadastro de Veiculo");
        janela.setLayout(null);

        // Adiciona o Titulo na tela
        janela.add(labelTitulo);
        labelTitulo.setBounds(210, 10, 200, 25);
                
        
        
        // Adiciona o label e o campo de texto para o nome
        janela.add(labelNome);
        labelNome.setBounds(100, 40, 80, 25);
        valorNome = new JTextField();
        janela.add(valorNome);
        valorNome.setBounds(200, 40, 200, 25);

        // Adiciona o label e o campo de texto para a idade
        janela.add(labelAno);
        labelAno.setBounds(100, 70, 80, 25);
        valorAno = new JTextField();
        janela.add(valorAno);
        valorAno.setBounds(200, 70, 200, 25);
        
        
        // Adiciona o label e o campo de texto para a Rg
        janela.add(labelMarca);
        labelMarca.setBounds(100, 100, 80, 25);
        valorMarca = new JTextField();
        janela.add(valorMarca);
        valorMarca.setBounds(200, 100, 200, 25);
        
     // Adiciona o label e o campo de texto para a Cep
        janela.add(labelEstilo);
        labelEstilo.setBounds(100, 130, 80, 25);
        valorEstilo = new JTextField();
        janela.add(valorEstilo);
        valorEstilo.setBounds(200, 130, 200, 25);
        
     // Adiciona o label e o campo de texto para o Telefone
        janela.add(labelCategoria);
        labelCategoria.setBounds(100, 160, 80, 25);
        valorCategoria = new JTextField();
        janela.add(valorCategoria);
        valorCategoria.setBounds(200, 160, 200, 25);
        
     // Adiciona o label e o campo de texto para o email
        janela.add(labelQuilometragem);
        labelQuilometragem.setBounds(100, 190, 100, 25);
        valorQuilometragem = new JTextField();
        janela.add(valorQuilometragem);
        valorQuilometragem.setBounds(200, 190, 200, 25);
        
     // Adiciona o botao Salvar  
        janela.add(botaoSalvar);
        botaoSalvar.setBounds(200, 230, 200, 25);
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
            int ano = Integer.parseInt(valorAno.getText());
            String marca = valorMarca.getText();
            String estilo = valorEstilo.getText();
            String categoria = valorCategoria.getText();
            String quilometragem = valorQuilometragem.getText();
            
            JOptionPane.showMessageDialog(janela, "Nome: " + nome + "\nAno: " + ano + "\nMarca:" + marca + "\nEstilo:" + estilo + "\nCategoria:" + categoria + "\nQuilometragem:" + quilometragem);
    }
    	
    }
    

    public static void main(String[] args) {
        new TelaCarro();
    }
}