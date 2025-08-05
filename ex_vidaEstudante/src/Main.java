import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double NPF = 0;
        System.out.print("Entre a NPA: ");
        double NPA = input.nextDouble();
        if(NPA < 60) {
            System.out.print("Parece que ficou de NP3 :(. Entre a nota da mesma: ");
            double NP3 = input.nextDouble();
            NPF = (NPA + NP3) / 2;
        }
        if(NPA >= 60 ||  NPF >= 50) {
            System.out.print("Você passou, parabéns!");
        }
        else{
            System.out.println("Ah, você não passou. Complicado.");
        }

        input.close();
    }
}