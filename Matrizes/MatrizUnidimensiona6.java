
import java.util.Scanner;

public class MatrizUnidimensiona6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] vetor = new int [5];

        for (int i =0;i<vetor.length;i++) {
        System.out.println("Informe um valor");
        vetor[i]=teclado.nextInt();
        }

        for (int i =0;i<vetor.length;i++) {
            System.out.println(vetor[i]);
        }
    }

}
