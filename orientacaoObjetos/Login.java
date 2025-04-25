
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        
        Scanner jv =new Scanner(System.in);

        Sistema info = new Sistema();

        System.out.println("Digite seu nome");
        info.nome = jv.nextLine();

        System.out.println("Digite seu CPF");
        info.cpf = jv.nextLine();

        System.out.println(info.nome + " " + info.cpf);
        
    }
}
