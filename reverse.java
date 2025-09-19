// import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;
// import java.util.Scanner;

// public class reverse {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
//         int[] arr = new int[n];
//         for(int  i = 0; i < n; i++){
//             arr[i] = s.nextInt();
//         }

//          int start = 0, end = n - 1;
//         for(int i = 0 ; i < n; i++){
//              if(start < end){
//                 int temp = arr[start];
//                 arr[start] = arr[end];
//                 arr[end] = temp;
//                 start++;
//                 end--;
//              }
//         }
        // for(int num : arr){
        //     System.out.print(num + " ");
        // }

         // Reverse using Collections
//         List<Integer> list = Arrays.asList(arr);
//         Collections.reverse(list);

//         System.out.println("Reversed Array:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }

//         s.close();
//     }
// }

import java.util.*;

class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  s = sc.nextInt();

        int arr[] = new int[s];
        for(int i = 0; i < s; i++){
            arr[i] = sc.nextInt();
        }

         List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

          Collections.reverse(list);

           for (int num : list) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
