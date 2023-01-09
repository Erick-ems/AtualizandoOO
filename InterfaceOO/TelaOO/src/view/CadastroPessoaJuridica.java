package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CadastroPessoaJuridica extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane painel = new GridPane();


        TextField campoNomeFantasia = new TextField();
        TextField campoEmail = new TextField();
        TextField campoTelefone = new TextField();
        TextField campoCep = new TextField();
        TextField campoCnpj = new TextField();


        
        
        
        painel.add(new Label("Nome Fantasia:"), 0, 0);
        painel.add(campoNomeFantasia, 1, 0);
        painel.add(new Label("Email:"), 0, 1);
        painel.add(campoEmail, 1, 1);
        painel.add(new Label("Telefone:"), 0, 2);
        painel.add(campoTelefone, 1, 2);
        painel.add(new Label("Cep:"), 0, 3);
        painel.add(campoCep, 1, 3);
        painel.add(new Label("Cnpj:"), 0, 4);
        painel.add(campoCnpj, 1, 4);



        


        Button botaoCadastro = new Button("Cadastrar");
        painel.add(botaoCadastro, 1, 7);

        
        Scene cena = new Scene(painel, 600, 400);
        primaryStage.setScene(cena);
        primaryStage.setTitle("Cadastro");
        primaryStage.show();
    }
}
