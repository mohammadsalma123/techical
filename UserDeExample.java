 class UserDeEx extends Exception {
    public UserDeEx(String msg){
        super(msg);
    }
}
class BankAccount{
    String name;
    int inbal;
    public BankAccount(String name,int inbal){
        this.name=name;
        this.inbal=inbal;
    }
    public void withdraw(int amount) throws UserDeEx{
        if(amount>inbal)  {
            throw new UserDeEx("not having enough amount");
           
        }else{
            inbal-=amount;
            System.out.println("amount debited successfully");
            System.out.println("balance is:"+this.inbal);
        }
    }
}
class UserDeExample {
        public static void main(String[] args) {
            BankAccount bobj=new BankAccount("salma",10000);
            try{
                bobj.withdraw(5000);
            }
            catch(UserDeEx e){
                System.out.println(e);
            }
            finally{
                System.out.println("thank you visit again");
            }
        }
    }

