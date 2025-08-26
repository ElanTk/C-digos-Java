import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean [][] campo;
        campo = new boolean[2][2];
        //true quer dizer que tem bomba.

        Random randX = new Random();
        int x = randX.nextInt(2);
        Random randY = new Random();
        int y = randY.nextInt(2);
        campo[x][y] = true;
        //enfiando a bomba aleatoriamente

        Scanner input = new Scanner(System.in);
        boolean sobreviveu = false;
        while(!sobreviveu) {
            sobreviveu = true;
            System.out.println("Insira o X de onde quer pisar.");
            x = input.nextInt();
            System.out.println("Insira o Y de onde quer pisar.");
            y = input.nextInt();
            if(campo[x][y] == true){
                System.out.println("Eita, parece que você explodiu. Tente novamente, pra ver se não explode desta vez.");
                sobreviveu = false;
            }
        }
        System.out.println("Você saiu vivo, parabens!!!");
    }
}