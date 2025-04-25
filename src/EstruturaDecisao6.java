import java.util.Scanner;

public class EstruturaDecisao6 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        float salario,salarioL,bonus;
        int idade;
        System.out.println("Digite o Valor do Salário");
        salario=teclado.nextFloat();
        System.out.println("Digite a Idade do Funcionário");
        idade=teclado.nextInt();
        bonus=0;
        if(salario>=1000 && idade>50){
            bonus=(float)(salario*0.10);
        } else if(salario<1000&&idade<=50){
            bonus=(float)(salario*0.05);
        } salarioL=salario+bonus;
        System.out.println("O salario é" + salario);
        System.out.println("O salario Líquido é" + salarioL);
        System.out.println("O bônus é" + bonus);

    }
    
}
