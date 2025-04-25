
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        
        Scanner jv = new Scanner(System.in);

        Classe2 ex2 = new Classe2();

        System.out.println("Digite a Nota 1: ");
        ex2.n1 = jv.nextFloat();

        System.out.println("Digite a Nota 2: ");
        ex2.n2=jv.nextFloat();

        ex2.media = (ex2.n1 + ex2.n2)/2;

        if (ex2.media >=6) {
            System.out.println("Aprovado: ");
        }else{
            System.out.println("Reprovado: ");
        }

        
    }
}
