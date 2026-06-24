import java.util.Scanner;
public class Revarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter a["+i+"] element: ");
            a[i]=sc.nextInt();
        }
        Rev(a);
    }
    public static void Rev(int[] a) {
        for(int i=a.length-1;i>=0;i--){
            System.out.println("Reverse array[i] ="+a[i]);
        }
    }
}
