
import java.util.Scanner;

public class Trabalho3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float comprimento,largura,altura,volume;
        System.out.println("Digite o comprimento: ");
        comprimento=teclado.nextFloat();
        System.out.println("Digite a largura: ");
        largura=teclado.nextFloat();
        System.out.println("Digite a altura: ");
        altura=teclado.nextFloat();

        volume= comprimento*largura*altura;
        System.out.println("O volume é: " + volume);
    }
}
