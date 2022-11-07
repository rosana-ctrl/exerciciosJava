import java.util.Scanner;

public class Exercicio35 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("digite o numero de lados: ");
        int lados = input.nextInt();
        System.out.println("digite o tamanho de cada lado");
        double tamanho = input.nextDouble();
        System.out.println("A area é de: " + poligonoArea(lados, tamanho));
    }

    public static double poligonoArea(int lados, double tamanho) {
        return (lados * (tamanho*tamanho))/(4.0*Math.tan((Math.PI / lados)));
    }
}
