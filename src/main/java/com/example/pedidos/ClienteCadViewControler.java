package com.example.pedidos;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class ClienteCadViewControler implements Initializable {
    public TextField tfid;
    public TextField tfnome;
    public TextField tfcep;
    public TextField tfendereco;
    public TextField tftelefone;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void onConfirmar(ActionEvent actionEvent) {
        ((Button)actionEvent.getSource()).getScene().getWindow().hide();
    }

    public void onCancelar(ActionEvent actionEvent) {
        ((Button)actionEvent.getSource()).getScene().getWindow().hide();
    }


    public void onPesquisar(KeyEvent keyEvent) {
    }

    public void onNovoCliente(ActionEvent actionEvent) {
    }

    public void onAlterar(ActionEvent actionEvent) {
    }

    public void onApagar(ActionEvent actionEvent) {
    }

    public void onFechar(ActionEvent actionEvent) {
    }
}
