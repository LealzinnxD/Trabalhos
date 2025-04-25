
import java.util.Scanner;


public class MatrizBidimensional {
    public static void main(String[] args) {
        Scanner jv = new Scanner(System.in);

        //Declaração da Matriz Bidimensional

        int [] [] leal = new int [3][3];

        for (int i = 0;i<leal.length;i++) {
            for (int j = 0;j<leal.length;j++) {
            System.out.println("Valores");
                
                leal[i][j] = jv.nextInt();
            }

           
            
        }
        //Imprimir Matriz Bidimensional

        for (int i = 0;i<leal.length;i++) {
        
        for (int j = 0;j<leal.length;j++) {

         System.out.println("Valores de Matriz: " + leal[i][j]);   
        }
        }
    }

    



    

}
