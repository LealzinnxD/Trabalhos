
import java.util.Scanner;

public class MatrizUnidimensiona14 {
    public static void main(String[] args) {
        Scanner jv = new Scanner(System.in);
        int [] n = new int [5];
        for (int i =0;i<n.length;i++) {
            System.out.println("Digite um Número: ");
            n[i]=jv.nextInt();
        }
        for (int i = 0;i<n.length;i++) {
        
            if (n[i]>100) {
                System.out.println(n[i]);
            }
        }
    }
}
