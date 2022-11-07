import java.util.Scanner;

public class Exercicio33 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        long n = input.nextLong();
        System.out.println("A soma dos dígitos é: " + SomaDigitos(n));
    }

    public static int SomaDigitos(long n) {
        int sum = 0;
        while (n != 0 ){
            sum += n % 10;
            n/= 10;
        }
        return sum;
    }
}

