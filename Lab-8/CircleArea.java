class Circle{
    static final double pi=3.14;
    int radius;
    Circle(int radius){
        this.radius=radius;
    }
    double calculated_area(){
       return (pi*radius*radius);
    }
}
public class CircleArea {
    public static void main(String[] args) {
        Circle c1=new Circle(20);
        Circle c2=new Circle(40);
        double a1=c1.calculated_area();
        double a2=c2.calculated_area();
        System.out.println("Cicle Area:- "+a1);
        System.out.println("Cicle Area:- "+a2);
    }
}
