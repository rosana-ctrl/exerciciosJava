import java.util.Scanner;

public class Exercicio49 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = input.nextInt();

       if(numero % 2 == 0){
            System.out.println(numero + " é um número par");
        }else{
           System.out.println(numero + " é um número ímpar");
       }
    }
}
