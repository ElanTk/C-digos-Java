public class Zumbi {
    String nome;
    double vida;

    double mostraVida() {
        return vida;
    }
    boolean transfereVida(Zumbi zumbiAlvo, double quantia){
        //Caso o zumbi vá ficar com 0 de vida ou menos, a transferência não tem sucesso.
        boolean success = false;

        if(vida > quantia) {
            zumbiAlvo.vida += quantia;
            vida -= quantia;
            success = true;
        }
        return success;
    }
}