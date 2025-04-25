public class MatrizBidimensional3 {
    public static void main(String[] args) {
        int[][] m = new int [3][3];
        int soma = 0;

        m[0][0]=50;
        m[0][1]=15;
        m[0][2]=40;
        m[1][0]=28;
        m[1][1]=0;
        m[1][2]=150;
        m[2][0]=13;
        m[2][1]=1;
        m[2][2]=58;

        for (int i = 0 ; i<m.length;i++) {
            for (int j = 0; j<m.length;j++) 
            soma=soma+m[i][j];
        }
        System.out.println("A soma é igual a:  " + soma );
    }

}
