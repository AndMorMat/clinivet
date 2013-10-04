package br.com.sof3.clinivet.entidade;

import java.sql.Date;

public class Agenda {
    private Integer id;
    private String dataEntrada;
    private String dataSaida;
    private String tipoServico;
    private double valorServico;
    private Animal animal;
    
    public Agenda() {
        
    }
    
    public Agenda(Integer id) {
        this.id = id;
    }
    
    public Agenda(Integer id, String dataEntrada, String dataSaida,
                String tipoServico, double valorServico, Animal animal) {
        
        this.id = id;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.tipoServico = tipoServico;
        this.valorServico = valorServico;
        this.animal = animal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
