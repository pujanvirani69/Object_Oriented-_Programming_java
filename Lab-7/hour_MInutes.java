
class Ang{
    double hour,minute;

     Ang(double hour , double minute){
        this.hour=hour;
        this.minute=minute;
    }
    void Ang1(){
        double ah=hour*30+minute*0.5;
        double am=minute*6;
        double difference=ah-am;
        if(difference<0){
            difference=difference*(-1);
        }
        if(difference>100){
            difference=360-difference;
        }
        System.out.println(" THis time Angle is: "+difference+" Degree");
    }
}
public class hour_MInutes {
    public static void main(String[] args) {
        Ang T1=new Ang(12, 30);
        T1.Ang1();
    }
}
