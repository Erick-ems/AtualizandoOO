package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaVeiculo implements ActionListener {

	
	private JFrame janela;
    private JLabel labelTitulo = new JLabel("INFORMAÇÕES DO VEICULO ");
    private JDesktopPane painelDesktop;
    
	
	
	public TelaVeiculo() {
		
		
		
        janela = new JFrame("Veiculo");
        janela.setLayout(null);
        
        janela.add(labelTitulo);
        labelTitulo.setBounds(80, 60, 300, 25);
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 15));
		
		
		
		
		
		
		
		
		
        janela.setSize(600, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {
		new TelaVeiculo();
	}
	
}
