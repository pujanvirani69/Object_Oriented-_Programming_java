import java.util.Scanner;
public class Largest3Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number a :");
        int a=sc.nextInt();
        System.out.println("Enter Number b :");
        int b=sc.nextInt();
        System.out.println("Enter Number c :");
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is Largest");
            }
            else{
                System.out.println("c is Largest");
            }
        }
        else {
            if(b>c){
                System.out.println("B is Largest");
            }
            else{
                System.out.println("C is Largest");
            }
        }
    }
}
