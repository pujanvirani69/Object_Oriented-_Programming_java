import java.util.Scanner;
public class Sortpivot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] temp=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.print("Enter a["+i+"] element: ");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a Pivot Index Number");
        int p=sc.nextInt();
        System.out.println("Enter a target: ");
        int target=sc.nextInt();
        a=Rotate(a, p, temp);
        Search(a, target, temp);
    }//main
    public static int[] Rotate(int[] a,int p,int[] temp) {
        int j=0;
        for(int i=p;i<a.length;i++){
            temp[j++]=a[i];
        }
        for(int i=0;i<p;i++){
            temp[j++]=a[i];
        }
        for(int i=0;i<a.length;i++){
            System.out.print(temp[i]+",");
        }
        System.out.print("\n");

        return temp;
    }//Rotate
    public static void Search(int[] a,int target,int[] temp) {
        for(int i=0;i<a.length;i++){
            if(target==a[i]){
                System.out.println("Element is a["+i+"] = "+a[i]);
                return;
            }
        }

        System.out.println(-1);
    }//Search
}
