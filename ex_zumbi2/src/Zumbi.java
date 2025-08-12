public class Zumbi {
    String nome;
    double vida;

    double mostraVida() {
        return vida;
    }
    void transfereVida(Zumbi zumbiAlvo, double quantia){
        zumbiAlvo.vida += quantia;
        vida -= quantia;
    }
}