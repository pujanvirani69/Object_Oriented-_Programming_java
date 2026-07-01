class Complex{
    int real,img;
    Complex(){
        real=0;
        img=0;
    }
    Complex(int real,int img){
        this.real=real;
        this.img=img;
    }
     Complex Complex_add(Complex c1,Complex c2){
        this.real=c1.real+c2.real;
        this.img=c1.img+c2.img;
        return this;
    }
}
public class Comlex_no {
    public static void main(String[] args) {
        Complex c1=new Complex(10, 20);
        Complex c2=new Complex(30, 20);
        Complex c3=new Complex();
        Complex answer=c3.Complex_add(c1, c2);
        System.out.println("real: "+answer.real);
        System.out.println("imaginary: "+answer.img);
        
    }
}
