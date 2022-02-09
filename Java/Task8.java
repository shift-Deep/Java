public class Task8 {
    
    public static void main(String args[]) 
    {
        int n = 141;
        int temp = n;
        int d = 0;
        int r = 0;
        while(n>0){
            r = n%10;
            d = d*10+r;
            n = n/10;
        }    
        if(temp==d){
            System.out.print("palindrome");
        }else{
            System.out.print("Not palindrome");
        }
    }
}
