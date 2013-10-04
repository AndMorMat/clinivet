package br.com.sof3.clinivet.entidade;

public class Estado {
    private Integer id;
    private String nome;

    
    public Estado() {
        
    }
    
    public Estado(Integer id) {
        this.id = id;
    }
    
    public Estado(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
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
