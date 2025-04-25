
import java.util.Scanner;

public class MatirzTridimensional {
    public static void main(String[] args) {
        Scanner jv = new Scanner(System.in);

        int [][][] wood = new int [3][3][3];

        for (int i = 0;i<wood.length;i++) {
            for (int j = 0;j<wood.length;j++) {
                for (int k= 0;k<wood.length;k++) {
                    
                    System.out.println("Valores para: " + i + "-" + j + "-" + k);
                    wood[i][j][k]=jv.nextInt();

                
                }

            }
             
        }
        
        for (int i = 0;i<wood.length;i++) {
            for (int j = 0;j<wood.length;j++) {
                for (int k= 0;k<wood.length;k++) {
                    
                   
                    System.out.println("Valores são: " + wood[i][j][k]);

                
                }

            }
             
        }

    }
}
