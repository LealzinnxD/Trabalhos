import java.util.Scanner;

public class ClasseSistema {
    
    public static void main(String[] args) {
        
        Scanner jv = new Scanner(System.in);

        ClasseCliente cliente = new ClasseCliente();
        ClasseFornecedor fornecedor = new ClasseFornecedor();
        ClasseProduto produto = new ClasseProduto();
        ClasseUsuario usuario = new ClasseUsuario();

        //Atributos do Objeto cliente
    System.out.println("Cadastre o Cliente: ");
    cliente.nome = jv.nextLine();

    System.out.println("Cadastre o CPF: ");
    cliente.cpf=jv.nextLine();

    
    }
}
