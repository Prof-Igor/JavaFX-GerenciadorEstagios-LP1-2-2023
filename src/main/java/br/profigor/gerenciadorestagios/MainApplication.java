package br.profigor.gerenciadorestagios;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    private static Stage stage;
    private static Scene inicioScene;
    private static Scene cadastroScene;
    private static Scene listaScene;
    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        stage.setTitle("Gerenciador de Estágios");

        Parent fxmlInicio = FXMLLoader.load(getClass().getResource("inicio.fxml"));
        inicioScene = new Scene(fxmlInicio);
        Parent fxmlCadastro = FXMLLoader.load(getClass().getResource("cadastro.fxml"));
        cadastroScene = new Scene(fxmlCadastro);
        Parent fxmlLista = FXMLLoader.load(getClass().getResource("lista.fxml"));
        listaScene = new Scene(fxmlLista);

        stage.setScene(inicioScene);
        stage.show();

//        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("inicio.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
    }

    public static void mudarTela(String src) {
        switch(src) {
            case "inicio":
                stage.setScene(inicioScene);
                break;
            case "cadastro":
                stage.setScene(cadastroScene);
                break;
            case "lista":
                stage.setScene(listaScene);
                break;
        }
    }

    public static void main(String[] args) {
        launch();
    }
}