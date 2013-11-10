package br.com.sof3.clinivet.entidade;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

public class Venda {
    private Integer id;
    private Date dataVenda;
    private double totalVenda;
    private String formaPagamento;
    private Vendedor vendedor;
    private Cliente cliente;
    private double desconto;
    private List<VendaProduto> itens = new LinkedList<VendaProduto>();
    
    public Venda() {
        
    }
    
    public Venda(Integer id) {
        this.id = id;
    }
    
    public Venda(Integer id, Date dataVenda, double totalVenda, String formaPagamento,
            Vendedor vendedor, Cliente cliente) {
        
        this.id = id;
        this.dataVenda = dataVenda;
        this.totalVenda = totalVenda;
        this.formaPagamento = formaPagamento;
        this.vendedor = vendedor;
        this.cliente = cliente;
    }
    
    public String[] addTableVendasEfetuadas(){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
         
        String [] dados = { String.valueOf(id), formatador.format(dataVenda), String.valueOf(totalVenda), formaPagamento,
                            String.valueOf(vendedor.getNome()), String.valueOf(cliente.getNome())
                          };
        return dados;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
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

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<VendaProduto> getItens() {
        return itens;
    }

    public void setItens(List<VendaProduto> itens) {
        this.itens = itens;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
