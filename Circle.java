import java.util.Scanner;

public class Circle {
    public static void area(float r){
        System.out.println("area"+(3.14f*r*r));
    }
    public static void main(String[] args) {
        //area(3);
        Scanner sc = new Scanner(System.in);
        float r=sc.nextFloat();
        area(r);

    }
}
