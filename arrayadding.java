import java.util.*;

public class arrayadding {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String arr1 = sc.nextLine();
    String arr2 = sc.nextLine();

    StringBuilder result = new StringBuilder();

    int i = arr1.length() - 1;
    int j = arr2.length() - 1;
    int add = 0;

    while(i >= 0 || j >= 0 || add != 0){
         int d1 = (i >= 0) ? arr1.charAt(i) - '0' : 0;
         int d2 = (j >= 0) ? arr2.charAt(j) - '0' : 0;
         int sum = d1 + d2 + add;

         result.append(sum % 10);
         add = sum / 10;
         i--;
         j--;
    }
    System.out.println(result.reverse().toString());
    sc.close();
    }
}
