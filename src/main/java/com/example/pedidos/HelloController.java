package com.example.pedidos;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void onprodutos(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("produto-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage= new Stage();
        stage.setTitle("Produtos");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }

    public void onclientes(ActionEvent actionEvent) throws IOException {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("cliente-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage=new Stage();
            stage.setTitle("Clientes");
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
    }

    public void oncategorias(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("categoria-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage= new Stage();
        stage.setTitle("Categoria");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }

    public void onsair(ActionEvent actionEvent) {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Deseja Realmente Sair?");
        if(alert.showAndWait().get()== ButtonType.OK){
            Platform.exit();
        }
    }

    public void onnovopedido(ActionEvent actionEvent) {
    }

    public void onabrirpedido(ActionEvent actionEvent) {
    }

    public void onrelclientes(ActionEvent actionEvent) throws IOException {

    }

    public void onrelpedidos(ActionEvent actionEvent) {
    }

    public void onsobre(ActionEvent actionEvent) {
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Pedidos\nversão2.0\nDsenvolvido por\nLeonardo Lopes");
        alert.showAndWait();

    }


}