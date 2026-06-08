public class Ex {
    public static void main(String[] args) {
        int arr[]={54,93,12,65};
        for(int i=0;i<arr.length;i++){
            int sum=0;
            int num=arr[i];
            while(num>0){
                int r=num%10;
                sum=sum+r;
                num=num/10;
            }
            System.out.println(sum);
        }
    }
}
