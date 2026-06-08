public class ExceptionEx {
    public static void main(String[] args) {
         System.out.println("hi");
        int a=10;
        int b=0;
        try{
        System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
         System.out.println("hello");
    }
}
