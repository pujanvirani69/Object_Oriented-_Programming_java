import java.util.Scanner;
public class Operator1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number a: ");
        int a=sc.nextInt();
        System.out.println("Enter Number b: ");
        int b=sc.nextInt();
        System.out.println("Press 1 to Addition Opreator \n Press 2 to Substraction Opreator \n Press 3 to Multiplication Opreator \n Press 4 to Division Opreator\n Press 5 To Modulo Opreator");
        int c=sc.nextInt();
        switch(c){
            case 1:
                System.out.println("a+b="+(a+b));
                break;
            case 2:
                System.out.println("a-b="+(a-b));
                break;
            case 3: 
                System.out.println("a*b="+(a*b));
                break;
            case 4: 
                System.out.println("a/b="+(a/b));
                break;
            case 5: 
                System.out.println("a%b="+(a%b));
                break;
            default : 
                System.out.println("Envalid Option");
        }
    }
}
