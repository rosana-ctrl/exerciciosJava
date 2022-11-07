import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("digite um valor para o lado: ");
        double lado = input.nextDouble();
        System.out.println("A area do hexagono é de: " + hexagonoArea(lado));
    }

    public static double hexagonoArea(double lado){
        return (6*(lado*lado))/(4*Math.tan(Math.PI/6));
    }
}
