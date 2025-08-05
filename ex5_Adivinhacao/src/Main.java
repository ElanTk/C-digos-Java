import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(10);;
        int guess = 0;
        System.out.println("Ola! Bora tentar adivinhar um numero.");

        while(num != guess){
            System.out.println("Escreva um numero (1 a 10).");
            guess = input.nextInt();
            if(num != guess){
                System.out.println("Não é " + guess + " :/");
            }
        }
        System.out.println("Parabens, era " + num + " mesmo!");
    }
}