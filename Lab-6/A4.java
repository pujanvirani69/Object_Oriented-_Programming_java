import java.util.*;;
class Arr
{
    int[] a={1,5,4,3,2};
    void sortarray(){
        int c=0;
        int min=a[0];
        
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    min=a[j];
                    a[j]=a[j+1];
                    a[j+1]=min;
                    
                    
                }
            }
        }

        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }//sort

    void sumarray(){
        int sum=0;
        for (int i : a) {
            sum=sum+i;
        }
        System.out.println("sum = "+sum);
    }//sum

    void Searcharray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a search element: ");
        int n=sc.nextInt();
        for(int i=0;i<a.length;i++){
                if(n==a[i]){
                    System.out.println("Entered element is"+a[i]+"is found a["+i+"]");
                    break;
                }
                else{
                    System.out.println("Entered element is"+a[i]+"is not found");
                }
            }
            sc.close();

    }//search
    void avgarray(){
        int sum=0;
        double avg=1;
        for (int i : a) {
            sum=sum+i;
        }
        System.out.println("avg = "+sum/a.length);

    }//avd
}

public class A4{
    public static void main(String[] args) {
        Arr arr=new Arr();
        arr.sortarray();
        arr.sumarray();
        arr.avgarray();
        arr.Searcharray();

    }
}