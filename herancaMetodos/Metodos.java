import java.util.Scanner;

public class Metodos {
    
    public String nome;
    public String telefone;
    public String cpf;
    public int numero;

    //Metodo Imprimir Atributos
    void leal(){

        Scanner ll = new Scanner(System.in);

        System.out.println("Digite o Nome: ");
        this.nome = ll.nextLine();

        System.out.println("Digite o Telefone: ");
        this.telefone=ll.nextLine();

        System.out.println("Digite o CPF: ");
        this.cpf=ll.nextLine();

        System.out.println("Digite o Numero: ");
        this.numero=ll.nextInt();
        

        System.out.println(this.nome + "  " + this.telefone + "  " + this.cpf + "  " + this.numero);
    }
}
