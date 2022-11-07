import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int N1 = input.nextInt();
        System.out.println("Digite o segundo número:");
        int N2 = input.nextInt();

        if (N1 != N2) {
            System.out.println(N1 + "!=" + N2);
        }if (N1 < N2) {
            System.out.println(N1 + "<" + N2);
        }if (N1 >= N2){
            System.out.println(N1 + ">=" + N2);
        }
    }
}
