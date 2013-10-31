package br.com.sof3.clinivet.dao;

import br.com.sof3.clinivet.entidade.Venda;
import br.com.sof3.clinivet.entidade.VendaProduto;
import br.com.sof3.clinivet.entidade.Vendedor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class VendaDAO extends GenericoDAO {
    
    public VendaDAO() {
    }

    public int addVenda(Venda v, boolean cascade) throws SQLException {
        v.setId(getNextId("vendas"));
        String query = "INSERT INTO vendas (id, data_venda, total_venda, forma_pagamento, id_vendedor, id_cliente) values (?,?,?,?,?,?)";

        double totalVenda = 0;
        
        for (VendaProduto item : v.getItens()) {
            totalVenda += item.getProduto().getPrecoVenda()* item.getQtd();
        }
        
        executeCommand(query, v.getId(), v.getDataVenda(), v.getTotalVenda(), v.getFormaPagamento(), v.getVendedor().getId(), v.getCliente().getId());
        if (cascade) {
            // Persist the Itens
            for (VendaProduto item : v.getItens()) {
                addVendaProduto(item);
            }
        }
        return v.getId();
    }
    
    public int addVendaSemCadastro(Venda v, boolean cascade) throws SQLException {
        v.setId(getNextId("vendas"));
        String query = "INSERT INTO vendas (id, data_venda, total_venda, forma_pagamento, id_vendedor) values (?,?,?,?,?)";

        double totalVenda = 0;
        
        for (VendaProduto item : v.getItens()) {
            totalVenda += item.getProduto().getPrecoVenda()* item.getQtd();
        }
        
        executeCommand(query, v.getId(), v.getDataVenda(), v.getTotalVenda(), v.getFormaPagamento(), v.getVendedor().getId());
        if (cascade) {
            // Persist the Itens
            for (VendaProduto item : v.getItens()) {
                addVendaProduto(item);
            }
        }
        return v.getId();
    }
    
    public int addVendaProduto(VendaProduto vp) throws SQLException {
        vp.setId(getNextId("vendas_produtos"));
        String query = "INSERT INTO vendas_produtos (id, id_venda, id_produto, qtd, desconto) values (?,?,?,?,?)";
        executeCommand(query, vp.getId(), vp.getVenda().getId(), vp.getProduto().getId(), vp.getQtd(), vp.getDesconto());
        return vp.getId();
    }
    
}
