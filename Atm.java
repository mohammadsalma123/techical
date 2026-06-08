 class AtmDetails {
    String card_type="debit";
    private static  int pin=1234;
    int card_no=789012;
    int amount=5000;
    public void  setPin(int newpin){
        this.pin=newpin;
        System.out.println("pin changed successfully");
    }
    public int getPin(){
        return this.pin;
    }
 }

 class Atm {


    public static void main(String[] args) {
         AtmDetails sb1=new AtmDetails();
        System.out.println(sb1.getPin());
        sb1.setPin(1010);
        System.out.println(sb1.getPin());
    }

}
