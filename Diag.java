public class Diag {
    public static void main(String[] args) {
        int n=5;
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j||i+j==n-1)
                    System.out.print("*");
                
                else
                    System.out.print(" ");
                
               
            }
             System.out.println(" ");
        }
    }
}
