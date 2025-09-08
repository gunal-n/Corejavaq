// import java.util.Scanner;
// class rotate{
//     public static void main(String[] args) {
//         Scanner s = new Scanner (System.in);
//         String str = s.nextLine();
//         System.out.println(str);
//     }
// }
   

    

































// class rotate{
//     public static void main(String[] args) {
//         Scanner s = new Scanner (System.in);
//         int n = s.nextInt();
//         int k = s.nextInt();
//         int[] nums = new int[n];
//         for(int i = 0; i < n; i++){
//             nums[i]=s.nextInt();
//         }
//         rotatea( nums, k);
//     }

//     public static void rotatea(int[] nums, int k) {
//         k = k % nums.length;
//         int a = nums.length;
//       int start = 0 , end = a - 1;
//       revers(start,end,nums);
//       revers(start,k-1,nums);
//       revers(k,end,nums);
//       for (int bs : nums) {
//         System.out.print(bs + " ");
//     }
//     }

//       public static void revers(int start, int end, int nums[]){
//            while(start < end){
//                int temp = nums[start];
//                nums[start] = nums[end];
//                nums[end] = temp;
//                start++;
//                end--;
//             }
//         }
//}