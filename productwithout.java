// import java.util.*;

// public class productwithout {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();
//         int[] nums = new int[n];

//         System.out.println("Enter " + n + " elements:");
//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }

//         int[] result = new int[n];

//         for (int i = 0; i < n; i++) {
//             int product = 1;
//             for (int j = 0; j < n; j++) {
//                 if (i != j) {
//                     product *= nums[j];
//                 }
//             }
//             result[i] = product;
//         }

//         System.out.println("Product of array except self:");
//         for (int val : result) {
//             System.out.print(val + " ");
//         }

//         sc.close();
//     }
// }

// Method 2: Space Optimized (Use only result array + one variable)

// import java.util.*;

// public class productwithout {
//     public static int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int[] result = new int[n];

//         // Step 1: Store prefix product directly into result
//         result[0] = 1;
//         for (int i = 1; i < n; i++) {
//             result[i] = result[i - 1] * nums[i - 1];
//         }

//         // Step 2: Multiply with suffix product (from right side)
//         int suffix = 1;
//         for (int i = n - 1; i >= 0; i--) {
//             result[i] *= suffix;
//             suffix *= nums[i];
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();
//         int[] nums = new int[n];

//         System.out.println("Enter " + n + " elements:");
//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }

//         int[] result = productExceptSelf(nums);

//         System.out.println("Product of array except self:");
//         for (int val : result) {
//             System.out.print(val + " ");
//         }

//         sc.close();
//     }
// }


// Optimized Code (O(n) time, O(1) extra space)

// import java.util.*;

// public class productwithout {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         int[] result = findproduct(n, arr);

//         for(int nums : result){
//             System.out.print(nums + " ");
//         }
//         sc.close();
//     }
//     public static int[] findproduct(int n, int[] arr){
//         int[] result = new int[n];

//         result[0] = 1;
//         for(int i = 1; i < n; i++){
//             result[i] = result[i - 1] * arr[i - 1];
//         }

//         int suffix = 1;
//         for(int i = n - 1; i >= 0; i--){
//             result[i] = result[i] * suffix;
//             suffix *= arr[i];
//         }

//         return result;
//     }
// }