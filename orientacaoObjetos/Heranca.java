import java.util.Scanner;

public class Heranca {
    public static void main(String[] args) {
        
        Scanner jv = new Scanner(System.in);

        ClasseMae mae = new ClasseMae();
        ClasseFilho filho = new ClasseFilho();
        ClasseFilha filha = new ClasseFilha();

        System.out.println("Digite o nome da Mãe: ");
        mae.nome=jv.nextLine();

        System.out.println("Digite A idade da Mãe: ");
        mae.idade=jv.nextInt();

        System.out.println("Digite o Nascimento da Mãe: ");
        mae.ano=jv.nextInt();

        mae.cpf=jv.nextLine();
        System.out.println("Digite o CPF da Mãe: ");
        mae.cpf=jv.nextLine();

        System.out.println("Digite a quantidade de Filhos: ");
        mae.qtdFilhos=jv.nextInt();

        //Informações do Filho
        filho.nome = jv.nextLine();
        System.out.println("Digite o Nome do Filho: ");
        filho.nome = jv.nextLine();

        System.out.println("Digite o CPF do Filho: ");
        filho.cpf = jv.nextLine();

        //Informações da Filha
        System.out.println("Digite o Nome da Filha:  ");
        filha.nome = jv.nextLine();

        System.out.println("Digite o CPF da Filha: ");
        filha.cpf = jv.nextLine();

        //Imprimir Atributos

        System.out.println("Mãe: " + mae.nome + " " + mae.ano + " " + mae.idade + " " + mae.cpf + "  " + mae.qtdFilhos );
        System.out.println("Filho: " + filho.nome + " " + filho.cpf );
        System.out.println("Filha: " + filha.nome + " " + filha.cpf);
    }
}
