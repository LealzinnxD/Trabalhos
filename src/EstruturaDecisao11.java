
import java.util.Scanner;

public class EstruturaDecisao11 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int valor;
        System.out.println("Digite um Valor: ");
        valor=teclado.nextInt();
        if (valor>=350 && valor<=500) {
        System.out.println("O valor se encontra entre 350 e 500");
        }else{
        System.out.println("O valor não se encontra entre 350 e 500");
        }

    }
}
