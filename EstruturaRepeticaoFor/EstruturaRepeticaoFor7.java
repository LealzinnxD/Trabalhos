
import java.util.Scanner;

public class EstruturaRepeticaoFor7 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int[] vetor = new int[5];
    for (int i = 0;i<=4;i++) {
    System.out.println("Informe um Valor: ");
    vetor[i]= teclado.nextInt();
    }for (int i = 0;i<=4;i++){
    System.out.println(vetor[i]);
    }

    }
}
