import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        String binaria = Integer.toBinaryString(numero);

        System.out.println(binaria);
    }
}
