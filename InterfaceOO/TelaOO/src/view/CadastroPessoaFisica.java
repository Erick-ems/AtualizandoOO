package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CadastroPessoaFisica extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    
    private TextField campoNome;
    private TextField campoEmail;
    private TextField campoTelefone;
    private TextField campoCep;
    private TextField campoCpf;
    private TextField campoIdade;
    private TextField campoRg;
    
    private Button botao;
    private Label labelResultado;

    @Override
    public void start(Stage stage) {
        campoNome = new TextField();
        campoEmail = new TextField();
        campoTelefone = new TextField();
        campoCep = new TextField();
        campoCpf = new TextField();
        campoIdade = new TextField();
        campoRg = new TextField();
        
        
        botao = new Button("Cadastrar");
        labelResultado = new Label();

        botao.setOnAction(event -> receberDados());

        GridPane painel = new GridPane();
        painel.add(new Label("Nome:"), 0, 0);
        painel.add(campoNome, 1, 0);
        painel.add(new Label("Email:"), 0, 1);
        painel.add(campoEmail, 1, 1);
        painel.add(new Label("Telefone:"), 0, 2);
        painel.add(campoTelefone, 1, 2);
        painel.add(new Label("Cep:"), 0, 3);
        painel.add(campoCep, 1, 3);
        painel.add(new Label("Cpf:"), 0, 4);
        painel.add(campoCpf, 1, 4);
        painel.add(new Label("Idade:"), 0, 5);
        painel.add(campoIdade, 1, 5);
        painel.add(new Label("Rg:"), 0, 6);
        painel.add(campoRg, 1, 6);
        
        
        painel.add(botao, 1, 7);

        Scene cena = new Scene(painel, 600, 400);
        stage.setScene(cena);
        stage.show();
    }

    public void receberDados() {
        String nome = campoNome.getText();
        String email = campoEmail.getText();
        String telefone = campoTelefone.getText();
        String cep = campoCep.getText();
        String cpf = campoCpf.getText();
        String idade = campoIdade.getText();
        String rg = campoRg.getText();
        
        
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Cep: " + cep);
        System.out.println("Cpf: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Rg: " + rg);
        
        
        
        
    }	
    
    
    
    
    
    

	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTelefone() {
		// TODO Auto-generated method stub
		return null;
	}


}
