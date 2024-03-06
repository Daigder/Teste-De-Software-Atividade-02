package org.example;

public class Produto {

    // OBRIGATÓRIO
    private int idProduto;
    // OBRIGATÓRIO
    private String nome;
    // OBRIGATÓRIO
    private String descricao;
    // OBRIGATÓRIO
    private String categoria;
    // OBRIGATÓRIO
    private double precoUnitario;
    // OBRIGATÓRIO
    private int quantidadeEmEstoque;

    public Produto() {
    }

    public Produto(int idProduto, String nome, String descricao, String categoria, double precoUnitario, int quantidadeEmEstoque) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.precoUnitario = precoUnitario;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
