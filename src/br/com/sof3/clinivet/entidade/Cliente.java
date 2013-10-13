package br.com.sof3.clinivet.entidade;

import java.sql.Date;
import java.util.List;

public class Cliente {
    private Integer id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String telefone;
    private String celular;
    private String email;
    private String endereco;
    private String bairro;
    private Cidade cidade;
    private Estado estado;
    
    
   /*public String[] addTable(){
        String [] dados = {nome, String.valueOf(idade), String.valueOf(sexo), String.valueOf(idiomas),dataNasc};
        return dados;
    }*/
    public void cadastrar(Integer id,String nome,String sobrenome,String cpf,String telefone,
            String celular,String email,String endereco,String bairro,Cidade cidade){
        setId(id);
        setNome(nome);
        setSobrenome(sobrenome);
        setCpf(cpf);
        setTelefone(telefone);
        setCelular(celular);
        setEmail(email);
        setEndereco(endereco);
        setBairro(bairro);
        setCidade(cidade);
        
    }
    
    public String[] addTable(){
        String [] dados={nome,cpf,telefone};
        return dados;
       
    }
    public Cliente() {
    
    }
    
    public Cliente(Integer id) {
        this.id = id;
    }
    
    public Cliente(Integer id, String nome, String sobrenome,
            String cpf, String telefone, String celular, String email,
            String endereco, String bairro, Cidade cidade) {
        
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
