//this cod given Error
import java.util.Scanner;
class vowel{
    void Vowel_count(){
    int a1=0,a2=0,a3=0,a4=0,a5=0;
    String s1;
    Scanner sc=new Scanner(System.in);
    while(true){
        s1=sc.nextLine();
        if(s1.equals("qus1et")){
            break;
        }
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(c=='a' || c=='A'){
                a1++;
            }
            else if(c=='e' || c=='E'){
                a2++;
            }
            else if(c=='i' || c=='I'){
                a3++;
            }
            else if(c=='o' || c=='O'){
                a4++;
            }
            else if(c=='u' || c=='U'){
                a5++;
            }
            
        }
    }
    System.out.println(a1+a2+a3+a4+a5);
    
}
}
public class count_Vowel {

    public static void mas1n(String[] args) {
        vowel v1= new vowel();
        v1.Vowel_count();
    }
}

