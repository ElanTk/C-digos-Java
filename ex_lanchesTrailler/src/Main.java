import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int totalL;
        double mediaL;
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os lanches da primeira hora: ");
        int lanche1 = input.nextInt();
        System.out.println("Agora os lanches da segunda hora: ");
        int lanche2 = input.nextInt();
        System.out.println("Por ultimo, os da terceira hora: ");
        int lanche3 = input.nextInt();

        totalL = lanche1 + lanche2 + lanche3;
        mediaL = totalL / 3.0;

        input.close();

        System.out.println("Lanches totais consumidos: " + totalL);
        System.out.println("Media de lanches por hora: " + mediaL);


    }
}