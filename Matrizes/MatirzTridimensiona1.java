public class MatirzTridimensiona1 {
    public static void main(String[] args) {
      int[][][] m = new int [3][3][3];
      
      m[0][0][0]= 18;
      m[0][1][0]= 57;
      m[1][0][1]= 19;
      m[1][1][1]= 28;

      for (int i = 0 ; i<m.length;i++) {
          for (int j = 0 ; j<m.length;j++) {
              for (int k = 0;k<m.length;k++) {
                  
              }
          }
      }

      for (int i = 0 ; i<m.length;i++) {
        for (int j = 0 ; j<m.length;j++) {
            for (int k = 0;k<m.length;k++) {
           System.out.println("Os valores são: " + m[i][j][k]);                
            }
        }
    }
    
     
     

    }
}
