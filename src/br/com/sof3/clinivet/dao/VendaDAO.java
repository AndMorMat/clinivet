package br.com.sof3.clinivet.dao;

import br.com.sof3.clinivet.entidade.Venda;
import br.com.sof3.clinivet.entidade.VendaProduto;
import br.com.sof3.clinivet.entidade.Vendedor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VendaDAO extends GenericoDAO {
    
    public VendaDAO() {
    }

    public int addVenda(Venda v, boolean cascade) throws SQLException {
        v.setId(getNextId("vendas"));
        String query = "INSERT INTO vendas (id, data_venda, total_venda, forma_pagamento, id_vendedor, id_cliente,desconto) values (?,?,?,?,?,?,?)";

        /*double totalVenda = 0;
        
        for (VendaProduto item : v.getItens()) {
            totalVenda += item.getProduto().getPrecoVenda()* item.getQtd();
        }*/
        
        executeCommand(query, v.getId(), v.getDataVenda(), v.getTotalVenda(), v.getFormaPagamento(), v.getVendedor().getId(), v.getCliente().getId(),v.getDesconto());
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
        String query = "INSERT INTO vendas (id, data_venda, total_venda, forma_pagamento, id_vendedor,desconto) values (?,?,?,?,?,?)";

        /*double totalVenda = 0;
        
        for (VendaProduto item : v.getItens()) {
            totalVenda += item.getProduto().getPrecoVenda()* item.getQtd();
        }*/
        
        executeCommand(query, v.getId(), v.getDataVenda(), v.getTotalVenda(), v.getFormaPagamento(), v.getVendedor().getId(),v.getDesconto());
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
    public ArrayList  getIdVendaByIdCliente(int id_cliente){
        ArrayList <Venda> toReturn = new ArrayList<>();
        try {
            ResultSet rs = executeQuery("select * from vendas where id_cliente = ?", id_cliente);
            while (rs.next()){
                toReturn.add(populateVenda(rs));
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar id_venda na classe VendaDAO: "+ex);
        }
        return toReturn;
    }
    public List<Venda> getVendaByVendedor(int id_vendedor) throws SQLException {
        List<Venda> toReturn = new LinkedList<Venda>();
       
        ResultSet rs = executeQuery("SELECT * FROM vendas WHERE id_vendedor like \""+id_vendedor+"%\";");
        
        while (rs.next()) {
            toReturn.add(populateVenda(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public List<Venda> getVendasDoDia() throws SQLException {
        List<Venda> toReturn = new LinkedList<Venda>();
        
        ResultSet rs = executeQuery("SELECT * FROM vendas WHERE data_venda = curdate()");
        
        while (rs.next()) {
            toReturn.add(populateVenda(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public List<Venda> getVendaPorData(String data) throws SQLException {
        List<Venda> toReturn = new LinkedList<Venda>();
        
        ResultSet rs = executeQuery("SELECT * FROM vendas WHERE data_venda like \""+data+"%\";");
        
        while (rs.next()) {
            toReturn.add(populateVenda(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public List<Venda> getAllVenda() throws SQLException {
        List<Venda> toReturn = new LinkedList<Venda>();
        
        
        ResultSet rs = executeQuery("SELECT * FROM vendas");
        
        while (rs.next()) {
            toReturn.add(populateVenda(rs));
        }
        rs.close();
        return toReturn;
    }
    
    
    public Venda getVenda(int idVenda) throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM vendas WHERE ID = ?", idVenda);
        Venda venda = new Venda();
        while (rs.next()) {
            venda = populateVenda(rs);
        }
        rs.close();
        return venda;
    }
    
    public static Venda populateVenda(ResultSet rs) throws SQLException {
        final VendedorDAO vendedorDAO = new VendedorDAO();
        final ClienteDAO clienteDAO = new ClienteDAO();
        
        Venda toReturn = new Venda();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setDataVenda(rs.getDate("DATA_VENDA"));
        toReturn.setTotalVenda(rs.getDouble("TOTAL_VENDA"));
        toReturn.setFormaPagamento(rs.getString("FORMA_PAGAMENTO"));
        toReturn.setVendedor(vendedorDAO.getVendedor(rs.getInt("ID_VENDEDOR")));
        toReturn.setCliente(clienteDAO.getCliente(rs.getInt("ID_CLIENTE")));
        
        return toReturn;
    }
}
