import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = input.nextInt();
        int soma = (n1 + n2);
        int sub = (n1 - n2);
        int divisao = (n1 / n2);
        int multiplicacao = (n1 * n2);
        int mod = (n1 % n2);

        System.out.println(soma + "/" + sub + "/" + divisao + "/" + multiplicacao + "/" + mod);

    }
}
