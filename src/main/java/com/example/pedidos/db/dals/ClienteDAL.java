package com.example.pedidos.db.dals;

import com.example.pedidos.db.DBSingleton;
import com.example.pedidos.db.entidades.Cliente;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAL {
    public List<Cliente> get(String filtro){
        if(!filtro.isEmpty()){


        }
        ResultSet rs= DBSingleton.getConexao().consultar("select * from clientes");
        List<Cliente> clientes=new ArrayList<>();
        try{
            while(rs.next()){
                clientes.add(new Cliente(rs.getInt("cli_id"), rs.getLong("cli_documento"), rs.getString("cli_endereco"), rs.getString("cli_email"), rs.getString("cli_email"), rs.getString("cli_email"), rs.getString("cli_email"), rs.getString("cli_email")));
            }
        }catch (Exception e){
            System.out.println(e);

        }

        return clientes;
    }
}
