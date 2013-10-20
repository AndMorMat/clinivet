/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.entidade;

/**
 *
 * @author xps-l502x
 */
public class Raca {
    private Integer id;
    private String nome;
    private int tipo_animal;
    
    public Raca(){
        
    }
    
    public Raca(Integer id){
        this.id = id;
        
    }
    
    public Raca(Integer id, String nome, int tipo_animal){
        this.id=id;
        this.nome=nome;
        this.tipo_animal = tipo_animal;
    }

    public int getTipo_animal() {
        return tipo_animal;
    }

    public void setTipo_animal(int tipo_animal) {
        this.tipo_animal = tipo_animal;
    }
    
    public Integer getId() {
        return id;
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
    
    
    
}
