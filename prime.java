import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(findPrime(n)){
            System.out.println(n + " is a Prime");
        }
        else{
            System.out.println(n + " is not a prime");
        } 
        sc.close();
    }
    public static boolean findPrime(int n){
        if(n <= 0){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
