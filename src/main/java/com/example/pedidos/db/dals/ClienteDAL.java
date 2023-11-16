package com.example.pedidos.db.dals;

import com.example.pedidos.db.DBSingleton;
import com.example.pedidos.db.entidades.Cliente;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAL implements IDAL<Cliente> {
    @Override
    public boolean gravar(Cliente entidade) {
        String sql= "INSERT INTO clientes(\n" +
                "\tcli_documento, cli_nome, cli_endereco, cli_bairro, cli_cidade, cli_cep, cli_uf, cli_email)\n" +
                "\tVALUES (#1, '#2', '#3', '#4', '#5', '#6', '#7', '#8');";
        sql=sql.replace("#1",""+entidade.getDocumento());
        sql=sql.replace("#2",entidade.getNome());
        sql=sql.replace("#3",entidade.getEndereco());
        sql=sql.replace("#4",entidade.getBairro());
        sql=sql.replace("#5", entidade.getCidade());
        sql=sql.replace("#6",entidade.getCep());
        sql=sql.replace("#7",entidade.getUf());
        sql=sql.replace("#8",entidade.getEmail());

        return DBSingleton.getConexao().manipular(sql);
    }

    @Override
    public boolean alterar(Cliente entidade) {
        String sql ="UPDATE public.clientes\n" +
                "\tSET cli_documento=#1, cli_nome='#2', cli_endereco='#3', cli_bairro='#4', cli_cidade='#5', cli_cep='#6', cli_uf='#7', cli_email='#8'\n" +
                "\tWHERE <condition>;";
        sql=sql.replace("#1",""+entidade.getDocumento());
        sql=sql.replace("#2",entidade.getNome());
        sql=sql.replace("#3",entidade.getEndereco());
        sql=sql.replace("#4",entidade.getBairro());
        sql=sql.replace("#5", entidade.getCidade());
        sql=sql.replace("#6",entidade.getCep());
        sql=sql.replace("#7",entidade.getUf());
        sql=sql.replace("#8",entidade.getEmail());

        return DBSingleton.getConexao().manipular(sql);
    }

    @Override
    public boolean apagar(Cliente entidade) {
        return DBSingleton.getConexao().manipular("DELETE FROM clientes where cli_cod="+entidade.getId());
    }

    @Override
    public Cliente get(int id) {
        String sql = "SELECT *FROM clientes where cli_id="+id;
        ResultSet rs = DBSingleton.getConexao().consultar(sql);
        Cliente cliente=null;
        try {
            while (rs.next()) {
                cliente=new Cliente(rs.getInt("cli_id"),
                        rs.getLong("cli_documento"), rs.getString("cli_nome"),
                        rs.getString("cli_endereco"), rs.getString("cli_bairro"), rs.getString("cli_cidade"),
                        rs.getString("cli_cep"), rs.getString("cli_uf"), rs.getString("cli_nome"));
                System.out.println(rs.getString("cli_nome"));
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
        return cliente;

    }
    @Override
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
