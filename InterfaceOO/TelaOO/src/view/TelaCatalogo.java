package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaCatalogo implements ActionListener {

	private JFrame janela;
	private JList<String> listaPreco;
	private String[] itensPreco = {"De 4000","De 6000","De 12000", "De 20000","De 40000", "De 80000", "De 100000" , "De 200000"};
	private JList<String> listaMarca;
	private String[] itensMarca = {"Audi", "BMW", "Chevrolet", "Citroen", "Fiat", "Ford", "Mitsubish"};
    private JLabel labelTitulo = new JLabel("Seja Bem vindo");
    private JLabel labelFaixaDePreco = new JLabel("Filtre a faixa de preço");
    private JLabel labelFaixaDeMarcas = new JLabel("Filtre as marcas");
    private JButton botaoPesquisar = new JButton("Pesquisar");
    
    
    public TelaCatalogo() {
    	janela = new JFrame("Catalogo");
        janela.setLayout(null);
        
        
        // Adiciona o Titulo na tela
        janela.add(labelTitulo);
        labelTitulo.setBounds(200, 10, 200, 25);
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        
        // Cria a lista com os itens predefinidos
        
        janela.add(labelFaixaDePreco);
        labelFaixaDePreco.setBounds(100, 120, 200, 25);
        listaPreco = new JList<>(itensPreco);
        listaPreco.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        janela.add(listaPreco);
        listaPreco.setBounds(100, 150, 200, 80);
        
        JScrollPane scrollPanePreco = new JScrollPane(listaPreco);
        scrollPanePreco.setBounds(100, 150, 150, 80);
        janela.add(scrollPanePreco);
        
        
        
        janela.add(labelFaixaDeMarcas);
        labelFaixaDeMarcas.setBounds(350, 120, 200, 25);
        listaMarca = new JList<>(itensMarca);
        listaMarca.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        janela.add(listaMarca);
        listaMarca.setBounds(350, 150, 200, 80);
        
        JScrollPane scrollPaneMarca = new JScrollPane(listaMarca);
        scrollPaneMarca.setBounds(350, 150, 150, 80);
        janela.add(scrollPaneMarca);
        
        
        
        // Adiciona o botao Salvar  
        janela.add(botaoPesquisar);
        botaoPesquisar.setBounds(180, 300, 200, 25);
        botaoPesquisar.addActionListener(this);
        
        
        
        
        // Define as configurações da janela
        janela.setSize(600, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
		
    
    
    
    
    
    
    public void actionPerformed(ActionEvent e) {
    	
    	
    	
    }
    
    public static void main(String[] args) {
        new TelaCatalogo();
    }
}