
import java.util.Scanner;

public class MatrizUnidimensiona12 {
    public static void main(String[] args) {
        Scanner jv = new Scanner(System.in);
        int [] l = new int [5];
        int cont = 0;

     for (int i = 0;i<l.length;i++) {
         System.out.println("Digite um Número: " );
         if (jv.nextInt()==10) {
             cont++;
         }
         System.out.println("Quantidade iguais a 10: " + cont);
      }

     }
}
