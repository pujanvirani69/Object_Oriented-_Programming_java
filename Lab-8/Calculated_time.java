// two times to add 
import java.util.Scanner;
class Time{
    int min;
    int hour;
    int sec;
    Time(){
        hour=0;
        min=0;
        sec=0;
    }
    Time(int hour,int min,int sec){
        this.min=min;
        this.hour=hour;
        this.sec=sec;
    }
    Time addtime(Time t1,Time t2,Time t3){
        this.hour=t1.hour+t2.hour+t3.hour;
        this.min=t1.min+t2.min+t3.min;
        this.sec=t1.sec+t2.sec+t3.sec;
        if(sec>60){
            this.min=this.min+this.sec/60;
        }
        if(min>60){
            this.min=this.min+this.min/60;
        }
        return this;
    }
    
}
public class Calculated_time{
    public static void main(String[] args) {
        Time t1=new Time(2, 55, 55);
        Time t2=new Time(3, 07, 10);
        Time t3=new Time(4, 20, 5);
        Time t4=new Time();
        t4.addtime(t1,t2,t3);
        System.out.println(t4.hour+":"+t4.min+":"+t4.sec);
    }
}
