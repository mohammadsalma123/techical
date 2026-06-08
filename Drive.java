import java.util.Scanner;

public class Drive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float cgpa=sc.nextFloat();
        if(cgpa>=7.5f){
            int back=sc.nextInt();
            if(back<=2){
                int coding=sc.nextInt();
                if(coding>=2){
                   int commn=sc.nextInt();
                   if(commn>=60){
                        System.out.println("Eligible for placement");
                   }else {
                    System.out.println("improve your communication skills");
                   }
                }else{
                    System.out.println("you have to clear atleast 2 coding questions");
                }
                
            }else {
                System.out.println("only 2 backlogs or less than it are accepted");
            }
        }else{
            System.out.println("you must need the above 7.5 cgpa");
        }
    }
}
