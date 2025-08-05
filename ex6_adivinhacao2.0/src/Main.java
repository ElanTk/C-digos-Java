import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(10) + 1;
        int guess = 0;
        System.out.println("Ola! Bora tentar adivinhar um numero.");

        while(num != guess){
            System.out.println("Escreva um numero (1 a 10).");
            guess = input.nextInt();
            if(num < guess){
                System.out.println("O numero é menor que " + guess + " :o");
            }
            if(num > guess){
                System.out.println("O numero é maior que " + guess + " :o");
            }
        }
        System.out.println("Parabens, era " + num + " mesmo!");
    }
}                                                                                                                