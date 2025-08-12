public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.nome = "Marcos";
        zumbi1.vida = 100;
        zumbi2.nome = "Carlos";
        zumbi2.vida = 80;

        System.out.println("Vida " + zumbi1.nome + ": " + zumbi1.mostraVida());
        System.out.println("Vida " + zumbi2.nome + ": " + zumbi2.mostraVida());

        zumbi1.transfereVida(zumbi2, 32.5);

        System.out.println("Vida " + zumbi1.nome + ": " + zumbi1.mostraVida());
        System.out.println("Vida " + zumbi2.nome + ": " + zumbi2.mostraVida());

    }

}