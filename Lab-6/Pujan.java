import java.util.Scanner;

class Student1{
    String Name;
    int roll;
    double spi;
    String Course;
    void setter(String s1,int r,double s,String c){
        Name = s1;
        roll = r;
        spi = s;
        Course = c;
    }
    void getter(){
        System.out.println(Name);
        System.out.println(roll);
        System.out.println(spi);
        System.out.println(Course);
    }
}

public class Pujan{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         Student1 s1=new Student1();
         System.out.println("Enter Name,roll,spi,course");
         s1.setter(sc.next(), sc.nextInt(), sc.nextDouble(), sc.next());
         s1.getter();
         sc.close();
    }
}