package com.example.pedidos.db.entidades;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
    private int id;
    private Cliente cliente;
    private LocalDate data;
    private double frete;
    private List<com.example.pedidos.db.entidades.Item> itens;

    public Pedido() {
        this(0,new Cliente(),LocalDate.now(),0);
    }

    public Pedido(int id, Cliente cliente, LocalDate data, double frete) {
        this.id = id;
        this.cliente = cliente;
        this.data = data;
        this.frete = frete;
    }

    public Pedido(Cliente cliente, LocalDate data, double frete) {
        this(0,cliente,data,frete);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public List<com.example.pedidos.db.entidades.Item> getItens() {
        return itens;
    }
    public void addItem(Produto produto, double preco, int quantidade)
    {
        itens.add(new com.example.pedidos.db.entidades.Item(produto,preco,quantidade));
    }
    public double getValor()
    {
        double valor=0;
        for(com.example.pedidos.db.entidades.Item item : itens)
            valor+=item.preco();
        return valor;
    }
}
