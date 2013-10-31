package br.com.sof3.clinivet.entidade;

import java.sql.Date;

public class Agenda {
    private Integer id;
    private String data;
    private String hora_inicio;
    private String hora_termino;
    private String tipo_servico;
    private String observacoes;
    private Cliente cliente;
    private Animal animal;

    
    public Agenda() {
        
    }
    
    public Agenda(Integer id) {
        this.id = id;
    }
    
  
    public Agenda(Integer id, String data, String hora_inicio, String hora_termino, String tipo_servico,String observacoes,Cliente cliente, Animal animal){
        this.id = id;
        this.data = data;
        this.hora_inicio = hora_inicio;
        this.hora_termino = hora_termino;
        this.tipo_servico = tipo_servico;
        this.observacoes = observacoes;
        this.cliente = cliente;
        this.animal = animal;
    }
    
    public String exibir(){
        return "Id: "+id+
                "\ndata: "+data+
                "\ninicio: "+hora_inicio+
                "\ntermino: "+hora_termino+
                "\ntipo serviço: "+tipo_servico+
                "\nobservaçoes: "+observacoes+
                "\ncliente: "+cliente.getNome()+
                "\nanimal: "+animal.getNome();
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_termino() {
        return hora_termino;
    }

    public void setHora_termino(String hora_termino) {
        this.hora_termino = hora_termino;
    }

    public String getTipo_servico() {
        return tipo_servico;
    }

    public void setTipo_servico(String tipo_servico) {
        this.tipo_servico = tipo_servico;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
    

}