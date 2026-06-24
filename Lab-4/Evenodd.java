import java.util.*;
public class Evenodd {
    public static boolean Evenod(int a){
        int rem=a%2;
        if(rem==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int a=sc.nextInt();
         boolean b=Evenod(a);
        if(b){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is odd");
        }

    }
}
