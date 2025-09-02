import inatel.cdg.inimigo.Asteroide;
import inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args) {
        Nave jogador1 = new Nave("MarquinDJ", 100, "Normal");
        Nave jogador2 = new Nave("MelissaDJ", 70, "Explosivo");
        Asteroide a1 = new Asteroide("A1", "Pequeno");
        Asteroide a2 = new Asteroide("A2", "Pequeno");
        Asteroide a3 = new Asteroide("A3", "Grande");
        Asteroide a4 = new Asteroide("A4", "Pequeno");
        Asteroide a5 = new Asteroide("A5", "Grande");
        Asteroide a6 = new Asteroide("A6", "Grande");

        jogador1.atirar(a1);
        jogador1.atirar(a3);
        jogador2.atirar(a2);
        jogador2.atirar(a3);
        jogador2.atirar(a5);
    }
}