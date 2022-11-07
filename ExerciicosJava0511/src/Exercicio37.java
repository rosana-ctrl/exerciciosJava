import java.util.Scanner;

public class Exercicio37 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        char[] letras = input.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for(int i = letras.length -1; i >= 0; i--){
            System.out.print(letras[i]);
        }
        System.out.print("\n");
    }
}
