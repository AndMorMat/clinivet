package br.com.sof3.clinivet.entidade;

public enum EnumTipoAnimal {
    C("Cachorro"),
    G("Gato");
    
    private final String nome;

    
    EnumTipoAnimal(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}