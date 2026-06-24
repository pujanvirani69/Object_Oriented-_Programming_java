import java.util.*;
class Account {
    int acc;
    double bal;
    private int pin;
    void setValue(int a,double b,int p) {
    acc = a;
    bal = b;
    pin = p;
    }
    void getValue(int a,int p){
    if(a == acc && p == pin)
            System.out.println("Account No.: "+acc+"\nBalance: "+bal);
        else
            System.out.println("Invalid Account No. or PIN!!!");
        }
}
public class BankAcc {
    public static void main(String[] a) {
    Scanner sc = new Scanner(System.in);

    Account a1 = new Account();
    System.out.print("Set PIN for first acc:");
    a1.setValue(sc.nextInt(),4557653.98,sc.nextInt());

    Account a2 = new Account();
    System.out.print("Set PIN for second acc:");
    a2.setValue(sc.nextInt(),2345562.42,sc.nextInt());
    
    Account a3 = new Account();
    System.out.print("Set PIN for Third acc:");
    a2.setValue(6481218,545138421.2,sc.nextInt());

    System.out.println("Password set successfully...");
    System.out.print("To check balance in 1st acc, enter account no. and password: ");
    a1.getValue(sc.nextInt(),sc.nextInt());
    System.out.print("To check balance in 2nd acc, enter account no. and password: ");
    a2.getValue(sc.nextInt(),sc.nextInt());
    System.out.print("To check balance in 3rd acc, enter account no. and password: ");
    a3.getValue(sc.nextInt(),sc.nextInt());
    sc.close();
 }
} 

