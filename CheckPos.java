import java.net.Socket;

public class CheckPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>0 && y>0){
            System.out.println("Q1");
        }else if(x<0 && y>0){
            System.out.println("q2");
        }else if(x<0 && y<0){
            System.out.println("q3");
        }else if(x>0 && y<0){
            System.out.println("q4");
        }else {
            System.out.println("origin");
        }
    }
}
