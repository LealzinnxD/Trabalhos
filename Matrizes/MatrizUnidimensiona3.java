
import java.util.Scanner;

public class MatrizUnidimensiona3 {
    public static void main(String[] args) {
        Scanner telcado = new Scanner (System.in);
        int [] matriz = new int[5];
        //Preenche os valores da Matriz
        for (int i=0;i<matriz.length;i++) {
         System.out.println("Digite os valores da Matriz: " + i);
         matriz[i]= telcado.nextInt();

         //System.out.println("Valores da Matriz: " + matriz[i]);   
        }
        //Imprime valores da Matriz
        for (int i = 0;i< matriz.length;i++) {
            System.out.println("Valores da Matriz: " + matriz[i]);
        }
    }
}
