
import java.util.Scanner;

public class EstruturaDecisao9 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        float nota1,nota2,nota3,nota4,media;
        System.out.println("Digite a Nota 1: ");
        nota1=teclado.nextFloat();
        System.out.println("Digite a Nota 2: ");
        nota2=teclado.nextFloat();
        System.out.println("Digite a Nota 3: ");
        nota3=teclado.nextFloat();
        System.out.println("Digite a Nota 4: ");
        nota4=teclado.nextFloat();
        media=(nota1+nota2+nota3+nota4)/4;
        System.out.println("A média do Aluno foi: " + media);
        if(media>7){
            System.out.println("Aluno Aprovado");
        } else{
            System.out.println("Aluno Reprovado");
        }

    }
}
