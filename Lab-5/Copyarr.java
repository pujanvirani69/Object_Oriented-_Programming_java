import java.util.Scanner;
public class Copyarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter a["+i+"] element: ");
            a[i]=sc.nextInt();
        }
        Copy(a, b);
    }
    public static void Copy(int[] a,int[] b) {
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        for(int i=0;i<a.length;i++){
            System.out.println("Array ["+i+"]="+b[i]);
        }
    }
}
