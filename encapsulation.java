import java.util.*;
class bank{
    private String accountholder;
    private double balance;
    private int id;
    public  void deposit(int num){
        balance+=num;
        System.out.println("Deposited successfully");
    }
    public void withdraw(int num){
        if(balance>0 && balance>=num){
            balance-=num;
            System.out.println("Amount withdraw successfully");
        }
        else{
            System.out.println("invalid task");
        }
    }
    public void display(){
        System.out.println("Amount balance is: "+balance);
    }
    public void add(String accountholder,int amount,int id){
        this.accountholder=accountholder;
        balance=amount;
        this.id=id;
    }
}
public class encapsulation{

    public static void main(String[] args) {
        bank s1=new bank();
        s1.add("velmurugan",100000,994);
        s1.display();
        s1.deposit(50000);
        s1.display();
    }
}