module com.example.pedidos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens com.example.pedidos to javafx.fxml;
    opens com.example.pedidos.db.entidades;
    exports com.example.pedidos;
    exports com.example.pedidos.db.entidades;
}