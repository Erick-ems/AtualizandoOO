package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CadastroCarro extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane painel = new GridPane();


        TextField campoNome = new TextField();
        TextField campoAno = new TextField();
        TextField campoMarca = new TextField();
        TextField campoEstilo = new TextField();
        TextField campoCategoria = new TextField();
        TextField campoQuilometragem = new TextField();

        
        
        
        painel.add(new Label("Nome:"), 0, 0);
        painel.add(campoNome, 1, 0);
        painel.add(new Label("Ano"), 0, 1);
        painel.add(campoAno, 1, 1);
        painel.add(new Label("Marca:"), 0, 2);
        painel.add(campoMarca, 1, 2);
        painel.add(new Label("Estilo:"), 0, 3);
        painel.add(campoEstilo, 1, 3);
        painel.add(new Label("Categoria:"), 0, 4);
        painel.add(campoCategoria, 1, 4);
        painel.add(new Label("Quilometragem:"), 0, 5);
        painel.add(campoQuilometragem, 1, 5);

        


        Button botaoCadastro = new Button("Cadastrar");
        painel.add(botaoCadastro, 1, 7);

        
        Scene cena = new Scene(painel, 600, 400);
        primaryStage.setScene(cena);
        primaryStage.setTitle("Cadastro");
        primaryStage.show();
    }
}
