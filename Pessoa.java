package Herança_2;

public class Pessoa {
    String Nome;
    String Endereço;
    String Telefone;
    int cpf;
    int cnpj;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String endereço) {
        Endereço = endereço;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCnpj() {
        return cnpj;
    }

    public Pessoa(int cpf, int cnpj) {
        this.cpf = cpf;
        this.cnpj = cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;


    }
}

