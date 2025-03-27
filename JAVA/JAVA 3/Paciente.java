public class Paciente {
    private String nome;
    private String rg;
    private String endereco;
    private String telefone;
    private String dataNascimento;
    private String profissao;

    public Paciente() {
    }

    public Paciente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void exibirDados() {
        System.out.println("Paciente: " + nome + ", RG: " + rg + ", Endereço: " + endereco + ", Telefone: " + telefone + ", Data de Nascimento: " + dataNascimento + ", Profissão: " + profissao);
    }
}