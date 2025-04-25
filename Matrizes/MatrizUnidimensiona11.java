
import java.util.Scanner;




public class MatrizUnidimensiona11 {
    public static void main(String[] args) {
    Scanner jv = new Scanner (System.in);

    int [] v = new int [5];
    int pares=0;
    
    for (int i = 0;i<v.length;i++) {
    System.out.println("Digite um Número: ");
    if (jv.nextInt() %2==0) {
        pares++;
    }
    System.out.println("Pares: " + pares);
    }

    }
}
