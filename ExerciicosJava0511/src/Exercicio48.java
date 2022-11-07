public class Exercicio48 {

    public static void main(String[] args){

        System.out.println("Divisiveis por 3: ");
            for(int i =1; i <= 100; i++) {
                if (i % 3 == 0) {
                    System.out.print( i + ",");
                }
            }
        System.out.println("Divisiveis por 5: ");
            for(int i =1; i <= 100; i++) {

                if (i % 5 == 0) {
                    System.out.print( + i + ",");
                }
            }
        System.out.println("Divisiveis por 3 e por 5: ");
            for (int i = 0; i <=100; i++) {
                if(i % 3 == 0  && i % 5 == 0){
                    System.out.print(+ i + ",");
                }
            }
    }
}
