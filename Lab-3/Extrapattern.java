//not completed
import java.util.Scanner;
public class Extrapattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("input Rows: ");
        int n=sc.nextInt();
        int j,i;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.println(j);
            }
        }
    }
}
