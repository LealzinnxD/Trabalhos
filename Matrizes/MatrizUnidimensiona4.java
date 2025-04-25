
import java.util.Scanner;

public class MatrizUnidimensiona4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        int [] gwa = new int [5];
        int soma = 0;

        for (int i = 0; i<gwa.length;i++) {
        System.out.println(".....");
        System.out.println("Digite os valores da matriz: " + i);
        gwa[i]=teclado.nextInt();

        soma += gwa[i];
        }

        for (int i=0; i<gwa.length;i++) {
            System.out.println("Valores da Matriz" + gwa[i]);
        }
        System.out.println("A soma dos valores é: " + soma);
    }
}
