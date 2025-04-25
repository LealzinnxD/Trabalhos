
import java.util.Scanner;

public class EstruturaDecisao7 {
    
 public static void main(String[] args) {
    
Scanner teclado=new Scanner (System.in);

double altura,pesoIdeal;
int sexo;
System.out.println("Digite sua Altura: ");
altura=teclado.nextDouble();
System.out.println("Informe o Sexo - 1 (F) ou 2 (M)");
sexo=teclado.nextInt();
if (sexo==1) {
    pesoIdeal=(double)((62.1*altura)-44.7);  
} else{
    pesoIdeal=(double)((72.7*altura)-58);
    System.out.println("O peso Ideal é: " + pesoIdeal);
}

 }

}
