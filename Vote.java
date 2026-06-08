import java.util.*;
public class Vote {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("enter age:");
        age=sc.nextInt();
        String vote=(age>18)?("eligible"):("not eligible");
        System.out.println(vote);
    }
    
}
