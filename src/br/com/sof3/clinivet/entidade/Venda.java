package br.com.sof3.clinivet.entidade;

import java.sql.Date;

public class Venda {
    private Integer id;
    private Date dataVenda;
    private double totalVenda;
    private String formaPagamento;
    private Vendedor vendedor;
    
    public Venda() {
        
    }
    
    public Venda(Integer id) {
        this.id = id;
    }
    
    public Venda(Integer id, Date dataVenda, double totalVenda, String formaPagamento,
            Vendedor vendedor) {
        
        this.id = id;
        this.dataVenda = dataVenda;
        this.totalVenda = totalVenda;
        this.formaPagamento = formaPagamento;
        this.vendedor = vendedor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}
