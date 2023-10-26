package br.profigor.gerenciadorestagios.controller;

import br.profigor.gerenciadorestagios.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class CadastroController {
    @FXML
    void mudaCadastro(ActionEvent event) {
        MainApplication.mudarTela("cadastro");
    }

    @FXML
    void mudaInicio(ActionEvent event) {
        MainApplication.mudarTela("inicio");
    }

    @FXML
    void mudaLista(ActionEvent event) {
        MainApplication.mudarTela("lista");
    }
}
