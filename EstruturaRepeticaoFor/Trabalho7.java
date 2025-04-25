
import java.util.Scanner;

public class Trabalho7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int idade;
        System.out.println("Digite a idade");
        idade=teclado.nextInt();
        if (idade<12) {
           System.out.println("Criança"); 
        }else if (idade<=12) {
            System.out.println("Adolesente");
        }else if (idade<=18) {
            System.out.println("Jovem");
        }else if (idade<=30) {
           System.out.println("Adulto"); 
        }else if (idade<=60) {
            System.out.println("Sabio");
        }else{
            System.out.println("Monge");
        }
    }
}
