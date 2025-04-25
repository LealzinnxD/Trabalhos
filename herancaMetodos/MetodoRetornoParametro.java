import java.util.Scanner;

public class MetodoRetornoParametro {
    
    public String carro;
    public int velocidade;

    //Método com Paramentro
    int turboCarro(int turbo ){

        Scanner jv = new Scanner(System.in);

        System.out.println("Digite o Nome do Carro: ");
        this.carro=jv.nextLine();

        System.out.println("Digite a Velocidade: ");
        this.velocidade = jv.nextInt();
        
        int velocidadeTotal = (this.velocidade + turbo);

        System.out.println("Velocidade Total " + velocidadeTotal);

        return velocidadeTotal;
    }
}
