
import java.util.Scanner;

public class EstruturaRepeticaoFor3 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    float notas;
    float soma = 0;
    for (int i = 1; i<=3;i++) {
    System.out.println("Digite a Nota");
    notas = teclado.nextFloat();
    soma += notas;    
    }
    System.out.println("A média é: " + soma/3);
    }
}
