
import java.util.Scanner;

public class EstruturaRepeticaoFor8 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner (System.in);
    int valor,maior;
    System.out.println("Digite um valor: ");
    valor=teclado.nextInt();
    maior=valor;
    for (int i = 2;i<=5;i++) {
    System.out.println("Digite um valor: ");
    valor=teclado.nextInt();
    if (valor>maior) {
        maior=valor;
    }
    System.out.println("O maior valor é: " + maior);
    }
    }
}
