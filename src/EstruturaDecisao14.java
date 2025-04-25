
import java.util.Scanner;

public class EstruturaDecisao14 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int numero;
        System.out.println("Digite um Número");
        numero=teclado.nextInt();
        if (numero==15) {
        System.out.println("O número é igual 15");
        }else{
        System.out.println("O número não é igual 15");
        }


    }
}
