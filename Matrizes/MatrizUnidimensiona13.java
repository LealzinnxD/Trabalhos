
import java.util.Scanner;



public class MatrizUnidimensiona13 {
    public static void main(String[] args) {
        Scanner jv = new Scanner(System.in);
        int [] n = new int[3];

        for (int i = 0;i<n.length;i++) {
            System.out.println("Digite um Número: ");
            n[i]=jv.nextInt();
        }
        for (int num : n) {
            System.out.println(num);
        }
    }
}
