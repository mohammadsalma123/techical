public class ExceptionEx2 {
    public static void main(String[] args) {
        /*  try{
            System.out.println(10/0);
        }
        catch(Exception e1){
            System.out.println("some other exception");
        }
        catch(ArithmeticException e){
            System.out.println();
        }*/
       int n=5;
       int[] arr=new int[n];
       arr[0]=10;
       arr[1]=20;
       arr[2]=30;
       arr[3]=40;
       arr[4]=50;
       try {

       
       System.out.println(arr[8]);
       }
       catch(Exception e){
        System.out.println(e.getMessage());
       }

    }
}
