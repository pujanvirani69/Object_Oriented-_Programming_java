import java.util.Scanner;
public class Sumarr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter a["+i+"] element: ");
            a[i]=sc.nextInt();
        }
        Sum(a);
    }
    public static void Sum(int[] a) {
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("sum="+sum);
    }
}