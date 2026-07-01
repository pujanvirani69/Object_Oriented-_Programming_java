class House{
    private String Address;
    private int Room_Number;
    private double Area=1;
    static double Prize=2000;
    House(String Address,int Room_Number,double area){
        this.Address=Address;
        this.Room_Number=Room_Number;
        this.Area=Area;
       
    }
    double calprize(){
        return (Area*Prize*Room_Number);
    }
}
public class House_Sell {
    public static void main(String[] args) {
        House h1=new House("Paris", 242, 50);
        House h2=new House("Dubai", 90, 40);
        House h3=new House("Sydney", 7, 100);
        double house1=h1.calprize();
        double house2=h2.calprize();
        double house3=h3.calprize();
        System.out.println("Parish :- "+House1);
        System.out.println("dubai :- "+House2);
        System.out.println("Sydney :- "+House3);
    }   
}
