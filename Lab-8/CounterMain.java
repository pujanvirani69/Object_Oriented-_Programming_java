class StudentB{ 
    static int count=0;
    String name;
    int age;
    static{
        System.out.print("Number of count of object:-");
    }
    StudentB(){
        count++;
    }
    StudentB(String name,int age){
        this.name=name;
        this.age=age;
        count++;
    }
    public static void dis() {
        System.out.println("Number of object: "+count);
    }
}
public class CounterMain {
    public static void main(String[] args) {
        StudentB s1=new StudentB();
        StudentB s2=new StudentB();
        StudentB s3=new StudentB();
        System.out.println("total student count: "+StudentB.count);
    }
}
