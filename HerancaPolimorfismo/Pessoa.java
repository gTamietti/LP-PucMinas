public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cep;
    private String cidade;
    private String uf;

    public Pessoa(String nome, String endereco, String telefone, String cep, String cidade, String uf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    // Getters
    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public String getTelefone() { return telefone; }
    public String getCep() { return cep; }
    public String getCidade() { return cidade; }
    public String getUf() { return uf; }

    // Setters
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setCep(String cep) { this.cep = cep; }
    public void setCidade(String cidade) { this.cidade = cidade; }
    public void setUf(String uf) { this.uf = uf; }

    public abstract void mostrarDados();
}
