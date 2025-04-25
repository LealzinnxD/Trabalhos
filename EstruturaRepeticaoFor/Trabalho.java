
import java.util.Scanner;

public class Trabalho {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float nota1,nota2,media;
        System.out.println("Digite a nota 1: ");
        nota1= teclado.nextFloat();
        System.out.println("Digite a nota 2: ");
        nota2= teclado.nextFloat();

        media=(nota1+nota2)/2;
        System.out.println("A media é: " + media);

    }
}
