
import java.util.Scanner;

public class Trabalho6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float salario;
        int idade;

        System.out.println("Digite o salario:");
        salario = teclado.nextFloat();
        System.out.println("Digite a idade do funcionario");
        idade=teclado.nextInt();

        double bonus1= salario*0.10;
        double bonus2= salario*0.05;

        if (salario>=1000 && idade>50) {
            System.out.println("bonus de 10%: ");
            System.out.println("valor do salario: " + (salario+bonus1));
        }else{
            System.out.println("Bonus de 5%: ");
            System.out.println("valor do salario: " + (salario+bonus2));
        }
    }
}
