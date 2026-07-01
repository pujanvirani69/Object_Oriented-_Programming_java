class BankDU{
    long account_number;
    double balance;
    static String Bank="Virani";
    static int interest_rate=8;
    BankDU(long account_number,double balance){
        this.account_number=account_number;
        this.balance=balance;
    }
    void view(){
        System.out.println("Account Holder Name :- "+account_number+"Balance : v"+balance+"Bank_Interst :- "+interest_rate);
    }
}
public class BankAcc {
    public static void main(String[] args) {
        BankDU b1=new BankDU(567891234, 9914521.0);
        BankDU b2=new BankDU(987654321, 45678249.0);
        BankDU b3=new BankDU(12345678, 987698.0);
        b1.view();
        b2.view();
        b3.view();
    }
}
