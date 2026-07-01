import java.util.Scanner;
class Circle{
    double radius;
    double pi=3.14;
    Circle(double radius){
        this.radius=radius;
        
    }
    static void Area(double pi,double radius){
        System.out.println("Area = "+(pi*radius*radius));
    }

}
public class Areaof_Circle{
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a Circle Radius : ");
        Circle c1=new Circle(20);
        Circle.Area(3.14,2);
    }
}