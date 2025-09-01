package br.inatel.cdg;

public class Conta {
    private int numero;
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    private float saldo;

    public float getSaldo() {
        return saldo;
    }

    private float limite;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void sacar(float quantia){
        if(quantia <= this.saldo){
            this.saldo -= quantia;
        }
    }
    public void deposita(float quantia){
        if(quantia >= this.saldo){
            this.saldo += quantia;
        }
    }




}
