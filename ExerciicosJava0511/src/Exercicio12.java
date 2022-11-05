import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = input.nextInt();
        System.out.println("Digite o terceiro número: ");
        int n3 = input.nextInt();

        double media = (n1 + n2 + n3) / 3;
        System.out.println("A média é de: " + media);
    }
}
