
import java.util.Scanner;

public class Trabalho2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float base,altura,area;
        System.out.println("Digite o valor da base: ");
        base= teclado.nextFloat();
        System.out.println("Digite o valor da altura: ");
        altura= teclado.nextFloat();
        area=(base*altura)/2;
        System.out.println("A area é: " + area);
    }
    
}
