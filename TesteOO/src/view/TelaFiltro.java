package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class TelaFiltro implements ActionListener {
	
	private JFrame janela;
	private JLabel labelTitulo = new JLabel("SELECIONE UM DOS FILTROS ");
	
	private JButton botaoMarca = new JButton("Marcas");
	private JButton botaoPreco = new JButton("PREÇO");
	
	
	public TelaFiltro() {
		janela = new JFrame("FILTRO DE PESQUISA");
		janela.setLayout(null);
		
		janela.add(labelTitulo);
		labelTitulo.setBounds(200, 10, 300, 25);
		
		
		
		
        janela.add(botaoMarca);
        botaoMarca.setBounds(150, 150, 100, 25);
        botaoMarca.addActionListener(this);
        
        

        janela.add(botaoPreco);
        botaoPreco.setBounds(350, 150, 100, 25);
        botaoPreco.addActionListener(this);
        

        // Define as configurações da janela
        janela.setSize(600, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
		
		
	}
	
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == botaoMarca) {
				
			}
			if 
				(e.getSource() == botaoPreco){
					
				}
		}

		public static void main(String[] args) {
	        new TelaFiltro();
	    }
}