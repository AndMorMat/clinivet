package br.com.sof3.clinivet.entidade;

public class Vendedor {
    private Integer id;
    private String nome;
    private String login;
    private String senha;
    
    public Vendedor() {
        
    }
    
    public Vendedor(Integer id) {
        this.id = id;
    }
    
    public Vendedor(Integer id, String nome, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }
    public String[] addTable(){
        String [] dados={nome,login};
        return dados;
       
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
