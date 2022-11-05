import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número...");
        int n1 = input.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = input.nextInt();
        int multiplicacao = (n1*n2);
        System.out.println("A multiplicacao é " + multiplicacao);
    }
}
