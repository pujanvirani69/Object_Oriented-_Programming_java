class Student{
    String Name;
    int roll;
    double spi;
    String course;
    void getter(){
        System.out.println("Name="+Name+"Roll no="+roll+"spi="+spi+"course="+course);
    }
    void setter(String Name,int roll,double spi,String course)
    {
        Name=Name;
        roll=roll;
        spi=spi;
        course=course;
    }
}
public class Demo{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2= new Student();
        s1.setter("Pujan", 309, 8.44, "CSE");
        s1.getter();
    }
}