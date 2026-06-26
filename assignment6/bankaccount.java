


public class bankaccount {
    String accountnumber; 
    String accountholder; 
    double balance; 
     

    void deposit(double amount){
        balance += amount;
    }

    void display(){
        System.out.println("accoutn number"+ accountnumber);
        System.out.println("name " + accountholder);
        System.out.println("balance " + balance);
    }
    public static void main(String[] args) {
        bankaccount b = new bankaccount();
        b.accountnumber = "2345";
        b.accountholder = "arjan"; 
        b.balance= 2000;
        b.deposit(1000);


        b.display();
    }
}
