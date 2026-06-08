import java.util.Scanner;

public class UserDef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int cols=sc.nextInt();
        int[][] mat1=new int[row][cols];
        int[][] mat2=new int[row][cols];
        int[][] res=new int[row][cols];

        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                res[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(res[i][j] + " " );
            }
            System.out.println();
        }
    }
}
