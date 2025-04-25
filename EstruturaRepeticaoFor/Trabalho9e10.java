import java.util.Scanner;

public class Trabalho9e10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int opcao;
        String usuario,senha,letra=null;
        boolean continuar = true;
      do { 
       System.out.println("Digite 1, 2, ou 3");
       opcao = teclado.nextInt();
       
       switch (opcao) {
         case 1:
         System.out.println("olá, você terá acesso a uma partedo sistema");
         System.out.println("Agora preciso da senha de acesso e o nome de usuário");
         
         usuario = teclado.nextLine();
         System.out.println("Pode digitar seu nome de usuario");
         usuario = teclado.nextLine();
         System.out.println("Agora sua senha");
         senha = teclado.nextLine();

          if (usuario.equals("Leal") && senha.equals("12345678")) {
             System.out.println("OK");
             System.out.println("A) cadastrar Produto \n b) cadastrar Fornecedor \n C) Cadastrar Cliente \n D) Sair");
         }else{
            System.out.println("Verifique seu usuario e senha");
         }
         break;
         case 2:
         System.out.println("Voce tem acesso parcial do sistema");
         System.out.println("Agora preciso da senha de acesso e o nome de usuário");
         
         usuario = teclado.nextLine();
         System.out.println("Pode digitar seu nome de usuario");
         usuario = teclado.nextLine();
         System.out.println("Agora sua senha");
         senha = teclado.nextLine();

          if (usuario.equals("Machado") && senha.equals("0987654321")) {
             System.out.println("OK");
             System.out.println("A) cadastrar Produto \n b) cadastrar Fornecedor \n C) Cadastrar Cliente \n D) Sair");
         }else{
            System.out.println("Verifique seu usuario e senha");
         }
         break;
         case 3:
         System.out.println("Voce é um adiministrador");
         System.out.println("Agora preciso da senha de acesso e o nome de usuário");
         
         usuario = teclado.nextLine();
         System.out.println("Pode digitar seu nome de usuario");
         usuario = teclado.nextLine();
         System.out.println("Agora sua senha");
         senha = teclado.nextLine();

          if (usuario.equals("Pele") && senha.equals("147258369")) {
             System.out.println("OK");
             System.out.println("A) cadastrar Produto \n b) cadastrar Fornecedor \n C) Cadastrar Cliente \n D) Sair");
         }else{
            System.out.println("Verifique seu usuario e senha");
         }
         break;
       }

      }while(false);
    }
}
