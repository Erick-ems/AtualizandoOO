package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controle.ControleDados;


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
    private JButton botaoExcluir = new JButton("Excluir");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private String s;
    	

    public void inserirEditarCarro(ControleDados d, int pos) {
    	
    	posicao = pos;
    	dados = d;
    	
    	
    	

		janela = new JFrame(s);
        janela.setLayout(null);

        // Adiciona o Titulo na tela
        janela.add(labelTitulo);
        labelTitulo.setBounds(210, 10, 200, 25);
                
              
        
        
        valorNome = new JTextField(dados.getCarros()[pos].getNome(), 200);
		valorAno = new JTextField(dados.getCarros()[pos].getAno(),200);
		valorMarca = new JTextField(dados.getCarros()[pos].getMarca(),200);
		valorEstilo = new JTextField(dados.getCarros()[pos].getEstilo(), 200);
		valorCategoria = new JTextField(dados.getCarros()[pos].getCategoria(), 200);
		valorQuilometragem = new JTextField(dados.getCarros()[pos].getQuilometragem(), 200);
               
        
        
		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelAno.setBounds(30, 50, 150, 25);
		valorAno.setBounds(180, 50, 180, 25);
		labelMarca.setBounds(30, 50, 180, 25);
		valorMarca.setBounds(180, 50, 180, 25);		
		labelEstilo.setBounds(30, 80, 150, 25);
		valorEstilo.setBounds(180, 80, 180, 25);
		labelCategoria.setBounds(30, 110, 150, 25);
		valorCategoria.setBounds(180, 110, 180, 25);
		labelQuilometragem.setBounds(30, 140, 150, 25);
		valorQuilometragem.setBounds(180, 140, 28, 25);
		
		
		
		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelAno);
		this.janela.add(valorAno);
		this.janela.add(labelMarca);
		this.janela.add(valorMarca);
		this.janela.add(labelEstilo);
		this.janela.add(valorEstilo);
		this.janela.add(labelCategoria);
		this.janela.add(valorCategoria);
		this.janela.add(valorQuilometragem);
		this.janela.add(labelQuilometragem);
		this.janela.add(botaoSalvar);

		this.janela.setSize(400, 250);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
		botaoSalvar.setBounds(245, 175, 115, 30);
		
		botaoSalvar.setBounds(120, 175, 115, 30);
		botaoExcluir.setBounds(245, 175, 115, 30);
		this.janela.add(botaoExcluir);
		
	}
		
		   
        

    
    public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			novoDado[0] = Integer.toString(dados.getQtdCarros());
		}else 
			novoDado[0] = Integer.toString(posicao);
		
		novoDado[1] = valorNome.getText();
		novoDado[2] = valorAno.getText();
		novoDado[3] = valorMarca.getText();
		novoDado[4] = valorEstilo.getText();
		novoDado[5] = valorCategoria.getText();
		novoDado[6] = valorQuilometragem.getText();
	
		if(src == botaoExcluir) {
			boolean res = false;
			
			res= dados.removerCarro(posicao);
			if (res) mensagemSucessoExclusao();
			else mensagemErroExclusaoCarro();
		}
		 
		
    }
    
	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ null, null, 
				JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoCarro() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o aluno est� matriculado\n"
				+ "em alguma disciplina. Se sim, cancele\n "
				+ "a matricula e tente novamente.", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	public static void main(String[] args) {
		new TelaCarro();
	}

    
	
}