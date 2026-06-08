import java.util.ArrayList;

public class Separate {
    public static void main(String[] args) {
        int[] arr={4,13,7,18,22,39,89,56};

        ArrayList<Integer> odd_list=new ArrayList<Integer>();
        ArrayList<Integer> even_list=new ArrayList<Integer>();
        for(int ele:arr){
            if(ele%2==0){
                even_list.add(ele);
            }
            else{
                odd_list.add(ele);
            }
        }
        System.out.println(even_list);
        System.out.println(odd_list);

    }
}
