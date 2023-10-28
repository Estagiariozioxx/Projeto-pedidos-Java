module com.example.pedidos {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.pedidos to javafx.fxml;
    exports com.example.pedidos;
}