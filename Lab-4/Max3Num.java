import java.util.*;
public class Max3Num {
    public static int MaxNum(int n1,int n2,int n3){
    int max;
    max=(n1>n2 && n1>n3)?(n1):((n2>n3)?(n2):(n3));
    return max;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number n1: ");
        int n1=sc.nextInt();
        System.out.println("Enter Number n2: ");
        int n2=sc.nextInt();
        System.out.println("Enter Number n3: ");
        int n3=sc.nextInt();
        int res=MaxNum(n1, n2, n3);
        System.out.println("Largest Number is = "+res);
        

    }
}