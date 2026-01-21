import java.util.Scanner;
public class Sieve{
    public static boolean isPrime(int num){
        if(num==0 || num==1){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean [] sieve(int n){
        boolean [] list= new boolean [n];
        for(int i=0;i<n;i++){
            list[i]=isPrime(i);
        }
        return list;
    }
    
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int length=in.nextInt();

        for (int i = 0; i < (sieve(length)).length; i++) {
            System.out.print((sieve(length))[i] + " ");
        }
    }
}