import java.util.Scanner;

public class palindromestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] arr = new int[128];
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            arr[ch] = arr[ch] + 1; 
        }

        int len = 0;
        int odd = 0;

        for(int i = 0; i < 128; i++){
            if(arr[i] > 0){
                if(arr[i] % 2 == 0){
                       len = len + arr[i];
                }
                else{
                    len = len + (arr[i] - 1);
                    odd = 1;
                }
            }
        }
        if(odd == 1){
            len = len + 1;
        }
        System.out.println(len);
        sc.close();
    }
}
