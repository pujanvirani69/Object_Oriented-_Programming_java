import java.util.*;
public class LeapYear {
    public static boolean Leap(int a){
        if(a%400==0){
            return true;
        }
        else if(a%4==0 && a%100!=0){
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int a=sc.nextInt();
        boolean b=Leap(a);
        if (b) {
            System.out.println("This is Leap Year");
        }
        else{
            System.out.println("This is Not Leap Year:");
        }
    }
}
