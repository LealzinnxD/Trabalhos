
import java.util.Scanner;

public class EstruturaRepeticaoFor11 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int valor,soma;
    soma=0;
    for (int i = 1;i<=7;i++) {
    System.out.println("Digite o valor: " + i);
    valor=teclado.nextInt();
    soma=soma+valor;
    System.out.println("A soma dos sete valores digitados é: " + soma);
    }
    }
}
