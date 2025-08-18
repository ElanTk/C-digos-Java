public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.nome = "Marcos";
        zumbi1.vida = 100;
        zumbi2.nome = "Carlos";
        zumbi2.vida = 80;

        //Dois zumbis diferentes, iniciados diferentemente:
        System.out.println("Vida " + zumbi1.nome + ": " + zumbi1.mostraVida());
        System.out.println("Vida " + zumbi2.nome + ": " + zumbi2.mostraVida());

        //Igualando os dois e mostrando:
        zumbi1 = zumbi2;
        System.out.println("Vida " + zumbi1.nome + ": " + zumbi1.mostraVida());
        System.out.println("Vida " + zumbi2.nome + ": " + zumbi2.mostraVida());

        //Os zumbis continuam o mesmo, e a primeira declaração é overwritten pela segunda
        zumbi1.vida = 15;
        zumbi2.vida = 20;
        System.out.println("Vida " + zumbi1.nome + ": " + zumbi1.mostraVida());
        System.out.println("Vida " + zumbi2.nome + ": " + zumbi2.mostraVida());

    }

}