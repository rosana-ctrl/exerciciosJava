public class Exercicio38 {

    public static void main(String[] args){
        String frase = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        count(frase);
    }

    public static void count(String x){
        char [] ch = x.toCharArray();
        int letra = 0;
        int space = 0;
        int num = 0;
        int outro = 0;
        for (int i = 0; i < x.length(); i++){
            if(Character.isLetter(ch[i])){
                letra ++;
            }
            else if(Character.isDigit(ch[i])){
                num ++;
            }
            else if(Character.isSpaceChar(ch[i])){
                space ++;
            }
            else{
                outro ++;
            }
        }
        System.out.println("Letra" + letra);
        System.out.println("Spaço" + space);
        System.out.println("Numeros" + num);
        System.out.println("Outros" + outro);
    }
}
