import java.util.Scanner;
public class Farenhit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("This Programme is Farenhit to Celsius Convert");
        System.out.println("Enter a Farenhit Number: ");
        float f=sc.nextFloat();
        float c=(f-32)*5/9;
        System.out.println("celsius="+c);
    }
}
