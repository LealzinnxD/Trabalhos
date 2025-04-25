
import java.util.Scanner;

public class MatrizUnidimensiona10 {
    public static void main(String[] args) {
     
     Scanner teclado = new Scanner(System.in);
     int [] v = new int[5];
     int soma=0;
    
     for (int i = 0;i<5;i++) {
        System.out.println("Digite um número: ");
        soma+=teclado.nextInt();
     }
     System.out.println("Média: " + (soma/5.0));
    }
}
