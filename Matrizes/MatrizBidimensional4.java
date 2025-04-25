
import java.util.Scanner;

public class MatrizBidimensional4 {
    public static void main(String[] args) {
        Scanner jv = new Scanner(System.in);
        int[][] m = new int [2][2];
        int vezes = 0;
        int valores;

        for (int i = 0;i<m.length;i++) {
          for (int j = 0;j<m.length;j++) {
             System.out.println("Digite um Valor: ");
             m[i][j]=jv.nextInt();
        }
        }
        System.out.println("Digite o Valor que você deseja saber quantas vezes Aparece na Matriz ");

        valores=jv.nextInt();
        for (int i = 0;i<m.length;i++) {
            for (int j = 0;j<m.length;j++){
                if (m[i][j]==valores) {
                    vezes=vezes+m[i][j];
                }
            }
        }
        System.out.println("O número de vezes que o valor aparece na Matriz é: " + vezes);
    }
}
