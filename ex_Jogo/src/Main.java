//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Personagem jogador = new Personagem();
        Arma arma1 = new Arma();
        jogador.nome = "Marcos Tubaro";
        jogador.pontos = 20;
        arma1.nome = "Shotgun Quadrada";
        arma1.poder = 20;
        arma1.resistencia = 50;
        arma1.descricao = " A arma de um antigo guerreiro: Pedro. Ele era um cubo roxo, segundo textos antigos.";

        System.out.println("P - Nome: " + jogador.nome + " HP: " + jogador.pontos);
        arma1.mostrarInfoArma();

        jogador.tomarDano();
        jogador.tomarDano();
        jogador.usarArma(arma1);

        System.out.println("P - Nome: " + jogador.nome + " HP: " + jogador.pontos);
        arma1.mostrarInfoArma();
    }
}