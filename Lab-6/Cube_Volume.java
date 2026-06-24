import java.util.Scanner;
class Cube{
    double height;
    double width;
    double depth;
    void setter(double h,double w,double d){
        height=h;
        width=w;
        depth=d;
    }//setter
    void getter(){
        System.out.println("Volume = "+(height*width*depth));
    }//getter
}
public class Cube_Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cube c1 = new Cube();
        System.out.println("Enter a cube 1 Height,width,depth");
        c1.setter(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        c1.getter();

        Cube c2 = new Cube();
        System.out.println("Enter a cube 2 Height,width,depth");
        c2.setter(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        c2.getter();

        sc.close();
    }
}
