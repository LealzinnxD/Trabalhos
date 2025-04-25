import java.util.Scanner;

public class MetodoRetorno {
    
    public String nome;
    public Float n1;
    public Float n2;
    
    //Método com Retorno
    Float calcularNotas(){
     
        Scanner jv = new Scanner(System.in);
        
        System.out.println("Informe a Nota 1: ");
        this.n1 = jv.nextFloat();
        
        System.out.println("Informe a Nota 2: ");
        this.n2=jv.nextFloat();

        Float media = (this.n1 + this.n2)/2;

        System.out.println(media);
        return media;


    }
}
