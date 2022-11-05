import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args){

       int numeroDec, remainder;
       String hexadecimal = "";

       char hex[]= { '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numeroDec = input.nextInt();

        while(numeroDec > 0){
            remainder = numeroDec % 16;
            hexadecimal = hex[remainder] + hexadecimal;
            numeroDec = numeroDec / 16;
        }
        System.out.println("O numero é: " + hexadecimal);
    }
}
