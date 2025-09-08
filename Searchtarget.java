// import java.util.Scanner;

// public class Searchtarget {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input array size
//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         // Input rotated sorted array
//         System.out.println("Enter " + n + " elements (rotated sorted array):");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Input target value
//         System.out.print("Enter target value: ");
//         int target = sc.nextInt();

//         // Linear search
//         int index = -1;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] == target) {
//                 index = i;
//                 break;
//             }
//         }

//         // Print result
//         if (index != -1) {
//             System.out.println("Target found at index: " + index);
//         } else {
//             System.out.println("Target not found.");
//         }

//         sc.close();
//     }
// }

// import java.util.*;

// public class Searchtarget {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Target number");
//         int t = sc.nextInt();

//         int index = -1;
//         for(int i = 0; i < n; i++){
//             if(arr[i] == t){
//                 index = i;
//                 break;
//             }
//         }
//         if(index != -1){
//             System.out.println("Target found at index: " + index);
//             System.out.println("Values : " + arr[index]);
//         }
//         else{
//             System.out.println("Target not found.");
//         }
//         sc.close();
//     }
// }

// Method 1: Modified Binary Search (Efficient)
// import java.util.Scanner;

// public class Searchtarget {
//     // Function to search in rotated sorted array
//     static int search(int[] arr, int target) {
//         int left = 0, right = arr.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (arr[mid] == target) {
//                 return mid; // target found
//             }

//             // Left half is sorted
//             if (arr[left] <= arr[mid]) {
//                 if (arr[left] <= target && target < arr[mid]) {
//                     right = mid - 1;
//                 } else {
//                     left = mid + 1;
//                 }
//             }
//             // Right half is sorted
//             else {
//                 if (arr[mid] < target && target <= arr[right]) {
//                     left = mid + 1;
//                 } else {
//                     right = mid - 1;
//                 }
//             }
//         }
//         return -1; // not found
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println("Enter " + n + " elements (rotated sorted array):");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter target value: ");
//         int target = sc.nextInt();

//         int result = search(arr, target);
//         if (result != -1) {
//             System.out.println("Target found at index: " + result);
//         } else {
//             System.out.println("Target not found.");
//         }

//         sc.close();
//     }
// }
