import java.util.Scanner;
public class Celsius {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("This Programme is Celsius to Farenhit Convert");
        System.out.println("Enter a Celsius Number: ");
        float c=sc.nextFloat();
        float f=(9*c)/5+32;
        System.out.println("Farenhit="+f);
    }
    
}
