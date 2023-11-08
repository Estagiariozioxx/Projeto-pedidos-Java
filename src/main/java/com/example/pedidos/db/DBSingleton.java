package com.example.pedidos.db;

public class DBSingleton {
    private static Conexao conexao;

    public static Conexao getConexao() {
        return conexao;
    }
    private DBSingleton (){

    }

    public static boolean conectar(){
        conexao=new Conexao();
        return conexao.conectar("jdbc:postgresql://localhost/","pedidosdb","postgres","postgres123");

    }
}
