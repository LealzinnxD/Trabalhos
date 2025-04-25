
import java.util.Scanner;

public class EstruturaRepeticaoWhile_14 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        int valor,soma;
        soma=0;
        for (int aux = 1; aux<=7; aux++) {
        System.out.println("Digite o valor: " + aux);
        valor=teclado.nextInt();
        soma=soma+valor;    
        }
        System.out.println("A soma dos sete valores é: " + soma);
    }
}
