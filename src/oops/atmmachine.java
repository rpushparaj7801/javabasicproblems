package oops;


class Account{
    int acc_no;
    String name;
    float amount;
    void input(int a, String n,float amt){
        acc_no=a;
        name=n;
        amount=amt;
    }
    void deposit(float amt){
        amount=amount+amt;
        System.out.println("deposited "+amt);
    }
    void withdraw(float amt){
        if (amount<amt){
            System.out.println("insufficient");
        }
        else {
            amount=amount-amt;
            System.out.println(amt+" withdrawn");
        }

    }
    void checkBalance (){
        System.out.println("balance is "+amount);

    }
    void display(){
        System.out.println(acc_no+" "+name+" "+amount);
    }

}
public class atmmachine {
    public static void main(String args[]) {

        Account a1=new Account();

        a1.input(2,"raj",3000);
        a1.display();
        a1.checkBalance();
        a1.deposit(10000);
        a1.checkBalance();
        a1.withdraw(5000);
        a1.checkBalance();



    }
}
