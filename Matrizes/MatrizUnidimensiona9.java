
import java.util.Scanner;

public class MatrizUnidimensiona9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] v = new int[5];
        int soma = 0;
       
        for (int i = 0;i<v.length;i++) {
            System.out.println(".......");
            System.out.println("Digite os valores da Matriz: " + i);
            v[i]=teclado.nextInt();
            soma += v[i];
        }
        for (int i=0;i<v.length;i++) {
            System.out.println("Valores da Matriz: " + v[i]);
        }
      
        System.out.println("A soma dos Valores é: " + soma);

    }
}
