package com.example.pedidos.db.dals;

import com.example.pedidos.db.DBSingleton;
import com.example.pedidos.db.entidades.Cliente;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAL {
    public List<Cliente> get(String filtro)
    {
        String sql = "SELECT *FROM clientes";
        if(!filtro.isEmpty())
        {

        }

        ResultSet rs = DBSingleton.getConexao().consultar(sql);
        List<Cliente> clientes = new ArrayList<>();
        try {
            while (rs.next()) {
                clientes.add(new Cliente(rs.getInt("cli_id"),
                        rs.getLong("cli_documento"), rs.getString("cli_nome"),
                        rs.getString("cli_endereco"), rs.getString("cli_bairro"), rs.getString("cli_cidade"),
                        rs.getString("cli_cep"), rs.getString("cli_uf"), rs.getString("cli_nome")));
                System.out.println(rs.getString("cli_nome"));
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
        return clientes;
    }
}
