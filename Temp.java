import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String temp=sc.nextLine();
        if(temp.equals("high")){
            System.out.println("NO");
        }else if(temp.equals("medium")){
            String cloudy=sc.nextLine();
            if(cloudy.equals("yes")){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }else{
            String rainy=sc.nextLine();
            if(rainy.equals("yes")){
                System.out.println("NO");
            }else{
                System.out.println("YES");
                }
        }
    }
}
