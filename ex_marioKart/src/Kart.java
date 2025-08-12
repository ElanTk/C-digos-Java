import java.sql.SQLOutput;

public class Kart {
    String nome;
    Piloto dono;
    Motor motor;
    public Kart(){
        motor = new Motor();
    }
    void pular(){
        System.out.println("SWHOOP! O kart " + nome + " da um pulo grande!");
    }

    void soltarTurbo(){
        System.out.println("O Kart " + nome + " solta um turbo, chegando em sua velocidade máxima de " + motor.velocidadeMaxima + ".");
    }

    void fazerDrift(){
        System.out.println("O Kart " + nome + " faz um drift bonito.");
    }
}
