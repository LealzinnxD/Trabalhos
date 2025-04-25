
import java.util.Scanner;

public class MatrizBidimensional1 {
    public static void main(String[] args) {
        Scanner jv = new Scanner(System.in);

        int[][] leal = new int [2][2];
        int resultado = 0;

        for (int i = 0;i<leal.length;i++) {
        for (int j = 0;j<leal.length;j++) {
         
            System.out.println("valores da Matriz" + i + "..." + j);
            leal[i][j] = jv.nextInt();
        }
        }
        //Imprimir Matriz
        for (int i = 0;i<leal.length;i++) {
        for (int j = 0;j<leal.length;j++) {
        
        resultado = (leal[0][0] + leal[1][1]) - (leal[0][1] + leal[1][0]);
        }
        }
        System.out.println(resultado);
    }

}
