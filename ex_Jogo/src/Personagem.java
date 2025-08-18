public class Personagem {
    String nome;
    int pontos; //Aparentemente de vida, mas no ex não falava :/

    void usarArma(Arma arma){
        arma.resistencia = arma.resistencia - 2;
        System.out.println(nome + " usa a sua arma, " + arma.nome + "!");
    }

    void tomarDano(){
        pontos = pontos - 5; //O personagem leva dano :/
    }


}
