import java.util.Scanner;
class Student {
    String Name;
    int Roll_no;
    double spi;
    String course;
    void setter(String s1,int r,double s,String s2){
        Name = s1;
        Roll_no = r;
        spi = s;
        course = s2;
    }//setter
    void getter(){
        System.out.println("Student Name = "+Name);
        System.out.println("Student Roll No. = "+Roll_no);
        System.out.println("Student spi = "+spi);
        System.out.println("Student course = "+course);
    }//getter
}// student class
public class Student_info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student S1 = new Student();
        System.out.println("Enter a S1 Student Name,Roll No,spi,course: ");
        
        S1.setter(sc.next(), sc.nextInt(), sc.nextDouble(), sc.next());
        S1.getter();

        Student S2 = new Student();
        System.out.println("Enter a S2 Student Name,Roll No,spi,course: ");
        S2.setter(sc.next(), sc.nextInt(), sc.nextDouble(), sc.next());
        S2.getter();

        Student S3 = new Student();
        System.out.println("Enter a S3 Student Name,Roll No,spi,course: ");
        
        S3.setter(sc.next(), sc.nextInt(), sc.nextDouble(), sc.next());
        S3.getter();
        
        
        sc.close();
    }
    
    
}
