import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Escreve o primeiro número: ");
        int n1 = input.nextInt();
        System.out.println("Escreva o segundo número: ");
        int n2 = input.nextInt();
        int divisao = (n1%n2);

        System.out.println("A divisao é de: " + divisao);

    }
}
