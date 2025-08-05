import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o numero de alunos:");
        int nAlunos = input.nextInt();

        switch (nAlunos){
            case 10, 20:
                System.out.println("Vai pra sala I-16.");
            break;

            case 30:
                System.out.println("Vai pra sala I-22.");
            break;

            default:
                System.out.println("Pior que esse número de alunos é invalido.");
        }

        input.close();
    }
}