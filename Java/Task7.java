public class Task7{
    
    public static Boolean checkprime(int n ){
        int i = 2;
        for(i = 2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }    
    public static void main(String args[]){
        int i = 0;
        for(i=2;i<=100;i++){
            if(checkprime(i)){
                System.out.print(" "+i);
            }
        }
    }
}
