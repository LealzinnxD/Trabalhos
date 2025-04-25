
import java.util.Scanner;

public class MatirzTridimensiona2 {
    public static void main(String[] args) {
     
        Scanner jv = new Scanner(System.in);
        int [][][] m = new int [2][2][2];
        int igual = 0;

        for (int i = 0;i<m.length;i++) {
            for (int j = 0;j<m.length;j++) {
                for (int k = 0;k<m.length;k++) {
                    System.out.println("Digite um valor");
                    m[i][j][k] = jv.nextInt();
                }
            }
        }

        for (int i = 0;i<m.length;i++) {
            for (int j = 0;j<m.length;j++) {
                for (int k = 0;k<m.length;k++) {
                
                    if (m[i][j][k] == 5) {
                        igual += 1;
                    }else{
                        System.out.println("Não tem nenhum cinco");
                    }
                   
                }
            }
        }
        System.out.println("Tem" + igual +"cincos");

    }
}
