package br.com.sof3.clinivet.entidade;

public class Fornecedor {
    private Integer id;
    private String nome;
    private String cnpj;
    private String telefone;
    private String email;
    private String endereco;
    private String bairro;
    private Cidade cidade;
    private Estado estado;
    private boolean inativo;
    
    public Fornecedor() {
        
    }
    
    public Fornecedor(Integer id) {
        this.id = id;
    }
    public void cadastrar(int id, String nome, String cnpj, String telefone,
                        String email, String endereco, String bairro, Cidade cidade, boolean inativo){
        setId(id);
        setNome(nome);
        setCnpj(cnpj);
        setTelefone(telefone);
        setEmail(email);
        setEndereco(endereco);
        setBairro(bairro);
        setCidade(cidade);
        setInativo(inativo);
      
    }
    public String exibir(){
        return "id: " +id+
                "\nNome: "+nome+
                "\ncnpj: "+cnpj+
                "\nTelefone: "+telefone+
                "\nEmail: "+email+
                "\nEndereco: "+endereco+
                "\nBairro: "+bairro+
                "\nCidade: "+cidade;
    }
    public Fornecedor(Integer id, String nome, String cnpj, String telefone,
            String email, String endereco, String bairro, Cidade cidade, Estado estado) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }
    public String[] addTable(){
        String [] dados={nome,cnpj,telefone,email};
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

    public boolean isInativo() {
        return inativo;
    }

    public void setInativo(boolean inativo) {
        this.inativo = inativo;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
