import java.util.Scanner;
class book{
    Scanner sc=new Scanner(System.in);
    String authorname;
    void author(){
        System.out.print("Enter Author Name :- ");
        authorname=sc.nextLine();
    }
    public String getAuthorname() {
        return authorname;
    }
    void disp(){

    }
}
class bookpublication extends book{
   private String bookpublication;
    void bookpub(){
        System.out.print("Enter Book Publication Name :- ");
        bookpublication=sc.nextLine();
    }
    void disp(){
        System.out.println(bookpublication+":"+getAuthorname());
    }
}
class paperpublication extends book{
    private String paperpublication;
    void paperpub(){
        System.out.print("Enter paper publication name :- ");
        paperpublication=sc.nextLine();
    }
    void disp(){
        System.out.println(paperpublication+":"+getAuthorname());
    }
    
}
public class DMDmain {
    public static void main(String[] args) {
        bookpublication bp=new bookpublication();
        paperpublication pp=new paperpublication();
        book b=new book();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter choice (1 Or 2):- ");
        int n=sc.nextInt();
        if(n==1){
           b=bp;
           bp.bookpub();
           bp.author();
        }
        else if(n==2){
           b=pp;
           pp.paperpub();
           pp.author();
        }
        b.disp();
        sc.close();
    }
}
