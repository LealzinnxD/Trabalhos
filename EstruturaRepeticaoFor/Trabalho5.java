
import java.util.Scanner;

public class Trabalho5 {
    public static void main(String[] args) {
        Scanner telcado = new Scanner(System.in);
        float nota1,nota2,nota3,media;
         System.out.println("Digite a nota 1: ");
         nota1= telcado.nextFloat();
         System.out.println("Digite a nota 2: ");
         nota2= telcado.nextFloat();
         System.out.println("Digite a nota 3: ");
         nota3=telcado.nextFloat();
         media=(nota1+nota2+nota3)/3;

         if (media>=7) {
             System.out.println("Esta aprovado: " + media);
         }else if (media>=5) {
             System.out.println("Esta de recuperação: " + media);
         }else{
            System.out.println("Esta reprovado: " + media);

         }
    }
}
