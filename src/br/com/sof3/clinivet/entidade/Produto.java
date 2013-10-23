package br.com.sof3.clinivet.entidade;

import java.sql.Date;
import javax.swing.JOptionPane;

public class Produto {
    private int id;
    private String codigo;
    private String nome;
    private double precoCusto;
    private double margemLucro;
    private double precoVenda;
    private String validade;
    private Fornecedor fornecedor;
    private int estoque;
    private String tipoProduto;
    
    public Produto() {
        
    }
    public void cadastrar(int id, String codigo, String nome, double precoCusto, double margemLucro,
            double precoVenda, String validade, Fornecedor fornecedor,int estoque,String tipoProduto) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.margemLucro = margemLucro;
        this.precoVenda = precoVenda;
        this.estoque = estoque;
        this.validade = validade;
        this.fornecedor = fornecedor;
        this.tipoProduto = tipoProduto;
    }
    
    public String[] addCarrinhoCompra(int qtd, double desconto){
        String [] dados = { nome, String.valueOf(qtd), String.valueOf(precoVenda - desconto), String.valueOf(desconto) };
        return dados;  
    }
    
    public String[] addTableBusca() {
        String [] dados = { codigo, nome, String.valueOf(precoVenda), String.valueOf(estoque) };
        return dados;
    }
    
    public String[] addTableConsulta(){
        String [] dados = { codigo, nome, tipoProduto, String.valueOf(precoVenda), String.valueOf(estoque)};
        return dados;
    }
    
    public Produto(int id) {
        this.id = id;
    }
    
    public String exibir(){
        return  "Id: "+id+
                "\nNome: " + nome +
                "\nPreco Custo: "+precoCusto+
                "\nPreco Venda: "+precoVenda+
                "\nEstoque: "+estoque+
                "\nValidade: "+validade+
                "\nFornecedor: "+fornecedor;       
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
    public double calcularPrecoVenda(double precoCusto, double margemLucro){
        return (precoCusto+(precoCusto*(margemLucro/100)));
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
    
    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setPrecoCusto(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMargemLucro(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
