import java.util.Scanner;
public class Operator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int a=10+20*30;
       int b=100/10*100;
       int c=5*4/4%3;
       int d=100+200/10-3*10;
        System.out.println("10+20*30="+a);
        System.out.println("100/10*100="+b);
        System.out.println("5*4/4%3="+c);
        System.out.println("100+200/10-3*10="+d);
    }
}