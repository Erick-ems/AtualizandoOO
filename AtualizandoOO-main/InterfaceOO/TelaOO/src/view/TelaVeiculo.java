package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaVeiculo implements ActionListener {

	
	private JFrame janela;
    private JLabel labelTitulo = new JLabel("INFORMAÇÕES DO VEICULO ");
    private JLabel labelCarroNome = new JLabel("NOME: ");
    private JLabel labelCarroAno = new JLabel("ANO: ");
    private JLabel labelCarroMarca = new JLabel("MARCA: ");
    private JLabel labelCarroEstilo = new JLabel("ESTILO: ");
    private JLabel labelCarroCategoria = new JLabel("CATEGORIA: ");
    private JLabel labelCarroQuilometragem = new JLabel("QUILOMETRAGEM:  ");
    private JLabel labelCarroPreco = new JLabel("PRECO:  ");
    private JButton botaoFazerOferta = new JButton("Fazer Oferta");
    private JLabel labelFazerOferta = new JLabel("DIGITE SUA OFERTA:  ");
    private JButton botaoEnviar = new JButton("Enviar");
    private JTextField entradaFazerOferta;


    
    


    
	
	
	public TelaVeiculo() {
		
		
		
        janela = new JFrame("Veiculo");
        janela.setLayout(null);
        
        janela.add(labelTitulo);
        labelTitulo.setBounds(80, 60, 300, 25);
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 15));
        
        janela.add(labelCarroNome);
        labelCarroNome.setBounds(80, 100, 300, 25);
        labelCarroNome.setFont(new Font("Arial", Font.BOLD, 15));
        
        janela.add(labelCarroAno);
        labelCarroAno.setBounds(80, 140, 300, 25);
        labelCarroAno.setFont(new Font("Arial", Font.BOLD, 15));
        
        janela.add(labelCarroMarca);
        labelCarroMarca.setBounds(80, 180, 300, 25);
        labelCarroMarca.setFont(new Font("Arial", Font.BOLD, 15));
        
        janela.add(labelCarroEstilo);
        labelCarroEstilo.setBounds(80, 220, 300, 25);
        labelCarroEstilo.setFont(new Font("Arial", Font.BOLD, 15));
        
        janela.add(labelCarroCategoria);
        labelCarroCategoria.setBounds(80, 260, 300, 25);
        labelCarroCategoria.setFont(new Font("Arial", Font.BOLD, 15));
        
        janela.add(labelCarroQuilometragem);
        labelCarroQuilometragem.setBounds(80, 300, 300, 25);
        labelCarroQuilometragem.setFont(new Font("Arial", Font.BOLD, 15));
        
        janela.add(labelCarroPreco);
        labelCarroPreco.setBounds(80, 340, 300, 25);
        labelCarroPreco.setFont(new Font("Arial", Font.BOLD, 15));
        
        // Adiciona o botao Salvar  
        janela.add(botaoFazerOferta);
        botaoFazerOferta.setBounds(80, 380, 200, 25);
        botaoFazerOferta.addActionListener(this);
		
		

		
		
		
		
		
		
        janela.setSize(1000, 600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botaoFazerOferta) {
			
	        janela.add(labelFazerOferta);
	        labelFazerOferta.setBounds(600, 60, 300, 25);
	        labelFazerOferta.setFont(new Font("Arial", Font.BOLD, 15));
	        
	        entradaFazerOferta = new JTextField();
	        janela.add(entradaFazerOferta);
	        entradaFazerOferta.setBounds(600, 90, 150, 25);
	        
	        janela.add(botaoEnviar);
	        botaoEnviar.setBounds(600, 120, 150, 25);
	        botaoEnviar.addActionListener(this);
	        
	        if(e.getSource() == botaoEnviar) {
	        	String oferta = entradaFazerOferta.getText();
	        	System.out.println(oferta);
	        }
			
			
		}
		
	}
	
	public static void main(String[] args) {
		new TelaVeiculo();
	}
	
}
