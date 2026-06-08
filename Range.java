public class Range {
    public static void main(String[] args) {
        int[] apples={5,6,-2,12};
        int[] oranges={-9,-7,8,2};
        int a=5,b=23,s=7,t=17;
        int acount=0,ocount=0;
        for(int i=0;i<apples.length;i++){
            if(a+apples[i]>=s && a+apples[i]<=t){
                acount++;
            }
        }
        for(int i=0;i<oranges.length;i++){
            if(b+oranges[i]>=s && b+oranges[i]<=t){
                ocount++;
            }
        }
        System.out.println(acount);
        System.out.println(ocount);

    }
}
