package br.com.sof3.clinivet.entidade;

import java.sql.Date;

public class Produto {
    private Integer id;
    private String nome;
    private double precoCusto;
    private double margemLucro;
    private Estoque estoque;
    private double precoVenda;
    private Date validade;
    private Fornecedor fornecedor;
    
    public Produto() {
        
    }
    
    public Produto(Integer id) {
        this.id = id;
    }
    
    public Produto(Integer id, String nome, double precoCusto, double margemLucro,
            double precoVenda, Estoque qtdEstoque, Date validade, Fornecedor fornecedor) {
        
        this.id = id;
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.margemLucro = margemLucro;
        this.precoVenda = precoVenda;
        this.estoque = qtdEstoque;
        this.validade = validade;
        this.fornecedor = fornecedor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
