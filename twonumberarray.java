
// Using HashMap (O(n))

// import java.util.*;

// public class twonumberarray {
//     public static int[] twoSum(int[] nums, int target) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < nums.length; i++) {
//             int complement = target - nums[i];
//             if (map.containsKey(complement)) {
//                 return new int[]{map.get(complement), i};
//             }
//             map.put(nums[i], i);
//         }
//         return new int[]{};  
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();
        
//         int[] nums = new int[n];
//         System.out.println("Enter " + n + " elements:");
//         for(int i = 0; i < n; i++){
//             nums[i] = sc.nextInt();
//         }

//         System.out.print("Enter target value: ");
//         int target = sc.nextInt();

//         int[] result = twoSum(nums, target);

//         if (result.length == 2) {
//             System.out.println("Indices: " + result[0] + ", " + result[1]);
//             System.out.println("Numbers: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
//         } else {
//             System.out.println("No two numbers found with the given target.");
//         }

//         sc.close();
//     }
// }


// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         int t = sc.nextInt();
        
//         boolean found = false;
//         for(int i = 0; i < n; i++){
//             for(int j = i + 1; j < n; j++){
//                 if(arr[i] + arr[j] == t){
//                    System.out.print("[" + i + "," + j + "]");
//                    found = true; 
//                    break;
//                 }
//             }
//             if(found) break;
//         }
//         if(!found){
//             System.out.println("No valid pair found.");
//         }
//         sc.close();
//     }
// }
