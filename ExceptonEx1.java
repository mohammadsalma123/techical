public class ExceptonEx1 {
    public static void main(String[] args) {
        String s="null";
        try {
        System.out.println(s.length());
        }
        catch(Exception e){
            System.out.println("exception occured");
        }
        finally{
            System.out.println("today is monday");
        }
    }
}
