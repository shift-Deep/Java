import java.lang.Math;
public class Task3 {

    public static void Swap(int n1, int n2){
        int temp = 0;
        temp = n1;
        n1 = n2;
        n2= temp;
        System.out.println("after swap \n n="+n1+" t="+n2);
    }
    public static void main(String args[]){

        double Ci=0;
        int n=12,t=10;
        float r=0.05f;
        int p=5000;
        Ci = (p*Math.pow((1+r/n),n*t));
        System.out.println("Compound Interest="+Ci);

        System.out.println("before swap: \n n="+n+" t="+t);
        Swap(n,t);


    }
}
