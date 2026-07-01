class parent{
    int x=50;
    parent(){
        System.out.println("This Is Blank Constructor inside Parent Class.");
    }
    parent(double balance){
        System.out.println(balance);
    }
    void display(){
        System.out.println("This Is method Which called using super");
    }
}
class child extends parent{
    int x=0;
    child(){
        super();
    }
    child(double balance){
        super(999);
    }
    void disp2(){
        System.out.println("disp of child.");
        super.display();
        System.out.println("child variable "+x);
        System.out.println("Parent variable "+super.x);
    }
}
public class SuperMain {
    public static void main(String[] args) {
        child b1=new child();
        b1.disp2();
        child b2=new child(999);
        b2.disp2();
        parent p1=new parent();
        p1.display();
    }
}
