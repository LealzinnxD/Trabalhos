
import java.util.Scanner;

public class Trabalho8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero;
        System.out.println("Digite um numero: ");
        numero=teclado.nextInt();
        if (numero==15) {
            System.out.println("Correto é o numero 15. ");
        }else{
            System.out.println("Errado é o numero 15. ");
        }
    }
}
