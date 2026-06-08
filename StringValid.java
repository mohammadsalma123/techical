public class StringValid {
    public static void main(String[] args) {
        String s="Bits@8924";
        /*char[] characters=s.toCharArray();
        int ucount=0,lcount=0,dcount=0,scount=0;
        int len=s.length();
        if(len>=8){ 
        for(char ch:characters){
            if(ch>='A' && ch<='Z'){
                ucount++;
            }else if(ch>='a' && ch<='z'){
                lcount++;
            }else if(ch>='0' && ch<='9'){
                dcount++;
            }else{
                scount++;
            }
        }

        
    }else{
        System.out.println("only 7");
    }
    if(len>=8 && ucount>0 && lcount>0 && dcount>0 && scount>0){
        System.out.println("valid");
    }else{
        System.out.println("ivalid");
    }*/
    int len=s.length();
    int ucount=0,lcount=0,dcount=0,scount=0;
    if(len>=8){ 
    for(int i=0;i<len;i++){
        if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
            ucount++;
        }else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
            lcount++;
        }else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
            dcount++;
        }else{
            scount++;
        }
    }
    }else {
        System.out.println("need 7 chars");
    }
    if(len>=8 && ucount>0 && lcount>0 && dcount>0 && scount>0){
        System.out.println("valid");
    }else{
        System.out.println("invalid");
    }

    

}
}