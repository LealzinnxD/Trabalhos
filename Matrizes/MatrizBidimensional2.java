
import java.util.Scanner;

public class MatrizBidimensional2 {
    public static void main(String[] args) {
        Scanner jv = new Scanner(System.in);

        float[] notas = new float [5];
        float media = 0;

        for (int i = 0;i<notas.length;i++) {
            System.out.println("Digite o Valor: " + (i+1));
            notas[i]=jv.nextFloat();
            media=media+notas[i];
        }
        media=media/5;
        System.out.println("A média é: " + media);
        System.out.println("Notas Acima da Média: ");
        for (int i = 0;i<notas.length;i++) {

            if (notas[i]>media) 
            
            System.out.println(notas[i]);
        }
    }
}
