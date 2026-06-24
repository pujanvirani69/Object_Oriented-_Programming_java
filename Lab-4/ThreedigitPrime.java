import java.util.Scanner;
public class ThreedigitPrime {
    public static boolean Prime(int a){
        int i;
        for(i=100;i<=999;i++){
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
        boolean b=Prime(a);
        if(b){
            System.out.println("Entered Number is Prime Number: ");
        }
        else{
            System.out.println("Entered Number is not Prime Number: ");
        }
    
}
    }
}
