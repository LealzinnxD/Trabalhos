
import java.util.Scanner;

public class App3 {
    
    public static void main(String[] args) {
        
        Scanner jv = new Scanner(System.in);

        Classe3 ex3 = new Classe3();

       System.out.println("Digite 1,2 ou 3");
       ex3.opcao = jv.nextInt();


       switch (ex3.opcao) {
        case 1 : 
            
        System.out.println("Está no Caso 1");

            break;
       
        case 2:
        System.out.println("Está no Caso 2");
            break;
        case 3:
        System.out.println(" Está no Caso 3");

        break;

        default:
        System.out.println("Foraa");
       }
    }
}
