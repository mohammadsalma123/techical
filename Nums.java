public class Nums {
    
    public static int arr(int[] nums){
        //int sum=0;
        int mul=1;
        for(int ele:nums){ 
        if(ele%2==0){
            //sum+=ele;
            mul*=ele;
        }
    }
    //return sum;
    return mul;
}
    public static void main(String[] args) {
        int[] nums={4,9,12,35,22,14};
        //System.out.println("even sum is: "+arr(nums));
        System.out.println("even mul is: "+arr(nums));
    }
}
