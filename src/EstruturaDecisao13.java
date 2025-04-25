
import java.util.Scanner;

public class EstruturaDecisao13 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int numero;
        System.out.println("Digite um Número: ");
        numero=teclado.nextInt();
        if (numero%8==0) {
        System.out.println("O numéro é divisível por 8");
        }else{
        System.out.println("O numéro não é divisível por 8");
        }

    }
}
