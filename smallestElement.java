// import java.util.*;

// public class smallestElement{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println("Enter " + n + " elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter value of k: ");
//         int k = sc.nextInt();

//         // Sort the array
//         Arrays.sort(arr);

//         if (k > 0 && k <= n) {
//             System.out.println(k + "-th smallest element is: " + arr[k - 1]);
//         } else {
//             System.out.println("Invalid k value.");
//         }

//         sc.close();
//     }
// }

import java.util.*;

public class smallestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the valu of k : ");
        int k = sc.nextInt();

        findsmallestelement(k ,n , arr);
        sc.close();
    }
    public static void findsmallestelement(int k, int n, int[] arr){
        Arrays.sort(arr);

        if(k > 0 && k <= n){
             System.out.println(k + "-th smallest element is: " + arr[k - 1]);
        }
        else{
             System.out.println("Invalid k value.");
        }

    }
}
 