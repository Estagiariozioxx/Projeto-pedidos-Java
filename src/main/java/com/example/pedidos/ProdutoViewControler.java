package com.example.pedidos;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ProdutoViewControler implements Initializable {
        public TableColumn onId;
        public TableColumn onNome;
        public TableColumn onCidade;
        public TableColumn onTelefone;
        public TextField tfPesquisa;

        private void abrirProduto() throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("produto-cad-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage= new Stage();
            stage.setTitle("Cadastro de Produtos");
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();

        }

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

        }

        public void onPesquisar(KeyEvent keyEvent) {
        }

        public void onNovoProduto(ActionEvent actionEvent) throws IOException {
            abrirProduto();
        }

        public void onAlterar(ActionEvent actionEvent) throws IOException {
            abrirProduto();
        }

        public void onApagar(ActionEvent actionEvent) {
        }

        public void onFechar(ActionEvent actionEvent) {
            ((Button)actionEvent.getSource()).getScene().getWindow().hide();
            //tfPesquisa.getParent().getScene().getWindow().hide();

        }
}
