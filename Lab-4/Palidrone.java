import java.util.*;
public class Palidrone {
    public static boolean PalidroneNumber(int a){
        int reverse=0;
        int rem=0;
        int temp=a;
        while(a!=0){
            rem=a%10;
            reverse=rem+reverse*10;
            a=a/10;
        }
        if(reverse==    temp){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number a : ");
    int a=sc.nextInt();
    boolean b=PalidroneNumber(a);
    if(b){
        System.out.println(a+" is palidrone Number");
    }
    else{
        System.out.println(a+" is Not palidrone Number");
    }
    }

}
