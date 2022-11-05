import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args){

        long binario1, binario2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        binario1 = input.nextInt();
        System.out.println("Digite o segundo número:");
        binario2 = input.nextInt();

        while(binario1 != 0 || binario2 != 0) {
            sum[i++] = (int)((binario1 % 10 + binario2 % 10 + remainder) % 2);
            remainder = (int)((binario1 % 10 + binario2 % 10 + remainder) / 2);
            binario1 = binario1 / 10;
            binario2 = binario2 / 10;
        }
        if(remainder != 0){
            sum[i++] = remainder;
        }
        i--;

        System.out.println("Soma dos números binários: ");

        while(i >= 0){
            System.out.println(sum[i--]);
        }
            System.out.println("\n");
    }
}
