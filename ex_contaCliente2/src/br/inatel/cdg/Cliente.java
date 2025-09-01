package br.inatel.cdg;

public class Cliente {
    private String nome;
    private long cpf;
    public Conta conta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public Cliente(){
        conta = new Conta();
    }
}
