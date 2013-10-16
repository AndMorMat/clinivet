package br.com.sof3.clinivet.entidade;

import br.com.sof3.clinivet.frames.SwingColumn;

public class VendaProduto {
    private Integer id;
    private Venda venda;
    @SwingColumn(description="Produto")
    private Produto produto;
    @SwingColumn(description="Quantidade")
    private int qtd;
    @SwingColumn(description="Total")
    private double total;
    
    public VendaProduto() {
        
    }
    
    public VendaProduto(Integer id) {
        this.id = id;
    }
    
    public VendaProduto(Integer id, Venda venda, Produto produto, int qtd) {
        this.id = id;
        this.venda = venda;
        this.produto = produto;
        this.qtd = qtd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getTotal() {
        if (getProduto()!= null) {
            return getProduto().getPrecoVenda()*getQtd();
        }
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
