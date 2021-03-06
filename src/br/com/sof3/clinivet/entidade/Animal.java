package br.com.sof3.clinivet.entidade;

import javax.swing.JOptionPane;

public class Animal {
    private Integer id;
    private String nome;
    private String tipoAnimal;
    private Raca raca;
    private String data_nasc;
    private String sexo;
    private Cliente dono;
    private boolean inativo;
    
    public Animal() {
        
    }
    public void exibir(){
        JOptionPane.showMessageDialog(null, "id:" +getId()+
                                            "\nnome: "+ getNome()+
                                            "\ntipo animal: "+ getTipoAnimal()+
                                            "\nraca: "+getRaca()+
                                            "\nData Nasc: "+getDataNasc()+
                                            "\nSexo: "+getSexo()+
                                            "\ndono"+dono.getId());
                                            
    }
    
    public Animal(Integer id) {
        this.id = id;
    }
    
    public String[] addTable(){
        String [] dados={tipoAnimal, raca.getNome(), nome, sexo};
        return dados;
       
    }
    
    public String[] addTableConsulta(){
        String cod = String.valueOf(id);
        String [] dados={cod, nome,raca.getNome(), tipoAnimal};
        
        return dados;
       
    }
    
    public Animal(Integer id, String nome, String tipoAnimal, Raca raca,
            String data_nasc, String sexo, Cliente dono, boolean inativo) {
        
        this.id = id;
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.raca = raca;
        this.data_nasc =  data_nasc;
        this.sexo = sexo;
        this.dono = dono;
        this.inativo = inativo;
    }

    public Integer getId() {
        return id;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public boolean isInativo() {
        return inativo;
    }

    public void setInativo(boolean inativo) {
        this.inativo = inativo;
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

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public String getDataNasc() {
        return data_nasc;
    }

    public void setDataNasc(String data_nasc){
        this.data_nasc = data_nasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }
}
