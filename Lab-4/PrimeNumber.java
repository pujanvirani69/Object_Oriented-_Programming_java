import java.util.*;
public class PrimeNumber {
    public static boolean Prime(int a){
        int count=0;
        int i;
        for(i=2;i<a;i++){
            if(a%i==0){
             count++;
            }
            }
            if(count==0){
                return true;
            }
            else{
                return false;
            }
        }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number a: ");
        int a=sc.nextInt();
        boolean b=Prime(a);
        if(b){
            System.out.println("Entered Number is Prime Number: ");
        }
        else{
            System.out.println("Entered Number is not Prime Number: ");
        }
    
}
    }
    


