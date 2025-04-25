
import java.util.Scanner;

public class EstruturaRepeticaoFor5 {
    
public static void main(String[] args) {
Scanner teclado = new Scanner (System.in);
int menor,valor,i;
System.out.println("Informe um Valor: ");
valor = teclado.nextInt();
menor=valor;
for (i=1; i<=2; i++) {
System.out.println("Informe um Valor: ");
valor= teclado.nextInt();
if (valor<menor) {
menor=valor;
System.out.println("O menor Valor é: " + menor);
}    
}
}
}
