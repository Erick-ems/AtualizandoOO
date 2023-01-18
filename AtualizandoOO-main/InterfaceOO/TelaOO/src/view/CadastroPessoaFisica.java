package view;


import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroPessoaFisica extends JFrame {
	private JTextField campoNome;
	private JButton botaoSalvar;
	private JLabel labelResultado;
	
	public static void main(String[] args) {
		CadastroPessoaFisica janela = new CadastroPessoaFisica();
	    janela.setVisible(true);
	}

	public CadastroPessoaFisica() {
	    setTitle("Cadastro de Pessoa Física");
	    setSize(600, 400);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    campoNome = new JTextField();
	    botaoSalvar = new JButton("Salvar");
	    labelResultado = new JLabel();

	    add(new JLabel("Nome:"));
	    add(campoNome);
	    add(botaoSalvar);
	    add(labelResultado);

	    setLayout(new GridLayout(4, 1));
	}

	public String getNome() {
	    return campoNome.getText();
	}

	public void setResultado(String resultado) {
	    labelResultado.setText(resultado);
	}

	public void addSalvarListener(ActionListener listener) {
	    botaoSalvar.addActionListener(listener);
	}

}