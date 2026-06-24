import java.util.Scanner;
public class Avgarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter a["+i+"] element: ");
            a[i]=sc.nextInt();
        }
        Avg(a);
    }
    public static void Avg(int[] a) {
        int sum=0;
        double avg=1;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        avg=sum/a.length;
        System.out.println("Average="+avg);
    }
}
