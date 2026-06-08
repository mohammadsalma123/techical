class String1{
    public static void main(String[] args) {
        String s="salma";
        //System.out.println(name.charAt(2));
        int len=s.length();
        //for(int i=len-1;i>=0;i--){
           // System.out.print(name.charAt(i));
        //}
        int count=0;
        for(int i=0;i<len;i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ){
                count++;
            }
        }
        System.out.println("vowel count is"+count);
    }
}