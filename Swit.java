import java.util.Scanner;

public class Swit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        switch(ch){
            default:
                System.out.println("Invalid choice");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("Three");
                break;
            
        }
        

    }
}
