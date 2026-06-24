import java.util.Scanner;
public class Studentmarks{
    public static void Studentmarks(int m1,int m2,int m3,int m4,int m5){
        float sum=0;
        sum= m1+m2+m3+m4+m5;
        float per=sum/5;
        if(per>=60){
            System.out.println("First Division");
        }
        else if(per>=50 && per<=59){
            System.out.println("Second Division");
        }
        else if(per>=40 && per<=49){
            System.out.println("Third Division");
        }
        else{
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m1,m2,m3,m4,m5;
        System.out.println("Enter First Subject Marks:");
        m1=sc.nextInt();
        System.out.println("Enter Second Subject Marks:");
        m2=sc.nextInt();
        System.out.println("Enter Third Subject Marks:");
        m3=sc.nextInt();
        System.out.println("Enter Fourth Subject Marks:");
        m4=sc.nextInt();
        System.out.println("Enter Five Subject Marks:");
        m5=sc.nextInt();
        Studentmarks(m1,m2,m3,m4,m5);
    }
    
}