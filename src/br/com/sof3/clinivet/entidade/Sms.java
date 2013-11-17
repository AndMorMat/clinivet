/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.entidade;

/**
 *
 * @author andrematos
 */
public class Sms {
    private int id;
    private String data;
    private String texto;
    private String hora;
    private Vendedor vendedor;
    private Cliente cliente;
        
    public void cadastrar(int id, String data, String texto, Vendedor vendedor,Cliente cliente,String hora){
        setId(id);
        setData(data);
        setTexto(texto);
        setVendedor(vendedor);
        setCliente(cliente);
        setHora(hora);
    }
    public String[] addTable(){
        String[] dados = {String.valueOf(id),data+" "+hora,texto,vendedor.getNome(),cliente.getNome()};
        return dados;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
}
