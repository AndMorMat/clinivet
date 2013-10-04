package br.com.sof3.clinivet.entidade;

import java.sql.Date;

public class Produto {
    private int id;
    private String nome;
    private double precoCusto;
    private double margemLucro;
    private Estoque estoque;
    private double precoVenda;
    private String validade;
    private Fornecedor fornecedor;
    
    public Produto() {
        
    }
    public void cadastrar(int id, String nome, double precoCusto, double margemLucro,
            double precoVenda, String validade, Fornecedor fornecedor) {
            this.id = id;
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.margemLucro = margemLucro;
        this.precoVenda = precoVenda;
        
        this.validade = validade;
        this.fornecedor = fornecedor;
    }
    public Produto(int id) {
        this.id = id;
    }
    
    public Produto(int id, String nome, double precoCusto, double margemLucro,
            double precoVenda, String validade, Fornecedor fornecedor) {
        
        this.id = id;
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.margemLucro = margemLucro;
        this.precoVenda = precoVenda;
        this.validade = validade;
        this.fornecedor = fornecedor;
    }
    public double calcularPrecoVenda(){
        return precoCusto*margemLucro;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
