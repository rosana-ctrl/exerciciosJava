import java.io.Console;

public class Exercicio42 {

    public static void main(String[] args){
        Console cons;
        if((cons = System.console()) != null){
            char [] password = null;
            try {
                password = cons.readPassword("password");
                System.out.println("Sua senha é: " + new String(password));
            }finally {
                if(password != null){
                    java.util.Arrays.fill(password, ' ');
                }
            }
        } else{
            throw new RuntimeException("Sem senha");
        }

    }
}
