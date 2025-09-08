// import java.util.Scanner;

// public class sliding {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("K values");
//         int k = sc.nextInt();

//         int maxSum = findsubarray(n, k, arr);
//         System.out.println( "Subarray " + k + " is " + maxSum);
//         sc.close();
//     }
//     public static int findsubarray(int n, int k, int[] arr){
//         int windowSum = 0;
//         for(int i = 0; i < k; i++){
//             windowSum += arr[i];
//         }
        
//         int maxSum = windowSum;
//         for(int i = k; i < n; i++){
//             windowSum += arr[i] - arr[i - k];
//             maxSum = Math.max(maxSum, windowSum);
//         }
//         return maxSum;
//     }
// }


import java.util.Scanner;

public class sliding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("K values");
        int k = sc.nextInt();

        int maxSum = findsubarray(n, k, arr);
        System.out.println( "Subarray " + k + " is " + maxSum);
        sc.close();
    }

    public static int findsubarray(int n, int k, int[] arr){
               int windowSum = 0;
               for(int i = 0; i < k; i++){
                windowSum += arr[i];
               }

               int currentSum = windowSum;
               for(int i = k; i < n; i++){
                windowSum += arr[i] - arr[i - k];
                currentSum = Math.max(currentSum, windowSum);
               }
               return currentSum;
    }
}