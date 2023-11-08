module com.example.pedidos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens com.example.pedidos to javafx.fxml;
    exports com.example.pedidos;
}