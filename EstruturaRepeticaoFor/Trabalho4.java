
import java.util.Scanner;

public class Trabalho4 {
    public static void main(String[] args) {
        Scanner tecaldo = new Scanner (System.in);
        int idade,dias;
        System.out.println("Digite sua idade: ");
        idade= tecaldo.nextInt();
        
        dias=(idade*365);
        System.out.println("Sua idade em dias é: " + dias);
        
    }
}
