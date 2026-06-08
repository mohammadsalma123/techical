public class Natural {
    public static int nat(int n) {
        if(n==1){
            return 1;
        }else {
            return n+nat(n-1);
        }
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(nat(n));
    }
}
