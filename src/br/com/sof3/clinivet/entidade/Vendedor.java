package br.com.sof3.clinivet.entidade;

public class Vendedor {
    private Integer id;
    private String nome;
    private String login;
    private String senha;
    private boolean inativo;
    
    public String exibir(){
        return "\nNome: " +nome+
               "\nLogin: " +login+
               "\nSenha: " +senha;
    }
    public Vendedor() {
        
    }
    public void cadastrar(Integer id, String nome, String login, String senha,boolean inativo){
        setId(id);
        setNome(nome);
        setLogin(login);
        setSenha(senha);
        setInativo(inativo);
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

    public boolean isInativo() {
        return inativo;
    }

    public void setInativo(boolean inativo) {
        this.inativo = inativo;
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
