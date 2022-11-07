import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio46 {

    public static void main(String[] args){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(formato.format(now));
    }
}


