
import java.util.Scanner;

public class MatrizUnidimensiona16 {
    public static void main(String[] args) {
        Scanner jv = new Scanner(System.in);

        int[] n = new int [5];
        int cont=0;

        for (int i = 0; i<n.length;i++) {
            System.out.println("Digite um Número: ");
            n[i]=jv.nextInt();

            if (n[i]<= 50) {
            
            cont++;
                
            }
        }
       System.out.println("Menores que 50: " + cont);
    }
}
