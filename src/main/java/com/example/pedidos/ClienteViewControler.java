package com.example.pedidos;

import com.example.pedidos.db.dals.ClienteDAL;
import com.example.pedidos.db.entidades.Cliente;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ClienteViewControler implements Initializable {
    public TableView <Cliente> tableView;
    public TableColumn <Cliente,Integer> onId;
    public TableColumn <Cliente,String> onNome;
    public TableColumn <Cliente,String> onCidade;
    public TableColumn <Cliente,String> onTelefone;
    public TextField tfPesquisa;

    private void abrirCliente() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("cliente-cad-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage= new Stage();
        stage.setTitle("Clientes");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        onId.setCellValueFactory(new PropertyValueFactory<>("id"));
        onNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        onCidade.setCellValueFactory(new PropertyValueFactory<>("cidade"));
        preencherTabela("");
    }
    private void preencherTabela(String filtro){
        List <Cliente> clientes = new ClienteDAL().get(filtro);
        tableView.setItems(FXCollections.observableArrayList(clientes));

    }

    public void onPesquisar(KeyEvent keyEvent) {
    }

    public void onNovoCliente(ActionEvent actionEvent) throws IOException {
        abrirCliente();
    }

    public void onAlterar(ActionEvent actionEvent) throws IOException {
        abrirCliente();
    }

    public void onApagar(ActionEvent actionEvent) {
    }

    public void onFechar(ActionEvent actionEvent) {
        ((Button)actionEvent.getSource()).getScene().getWindow().hide();
        //tfPesquisa.getParent().getScene().getWindow().hide();

    }

}
