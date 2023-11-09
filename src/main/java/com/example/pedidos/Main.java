package com.example.pedidos;

import com.example.pedidos.db.Conexao;
import com.example.pedidos.db.DBSingleton;
import com.example.pedidos.db.dals.ClienteDAL;
import com.example.pedidos.db.entidades.Cliente;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        DBSingleton.conectar();
        List <Cliente> clientes = new ClienteDAL().get("");
        for(Cliente c : clientes)
            System.out.println(c.getNome());

    }
}
