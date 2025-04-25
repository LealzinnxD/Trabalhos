import java.util.Scanner;

public class EstruturaDecisao8 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        double totalVendas,salario;
        System.out.println("Digite o total das Vendas: ");
        totalVendas=teclado.nextFloat();
        if (totalVendas>2000) {
            salario=(double)(totalVendas*0.10+50);
        }else{
            salario=(double)(totalVendas*0.075);
            System.out.println("O salário é: " + salario);
        }

    }

}
