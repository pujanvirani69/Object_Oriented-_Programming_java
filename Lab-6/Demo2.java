public class Demo2{
    public static void main(String args[]){
        int[] a={1,6,3,4,32};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int min=a[j];
                    a[j]=a[j+1];
                    a[j+1]=min;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }
}