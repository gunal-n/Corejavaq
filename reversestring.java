import java.util.Scanner;

// class reversestring{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         StringBuilder str1 = new StringBuilder(str);
//         str1.reverse();
//         System.out.println(str1);
//         sc.close();
//     }
// }

// public class reversestring {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         char[] ch = str.toCharArray();
//         int left = 0, right = ch.length - 1;

//         while (left < right) {
//             char temp = ch[left];
//             ch[left] = ch[right];
//             ch[right] = temp;
//             left++;
//             right--;
//         }
//         System.out.println(ch);
//         sc.close();
//     }
// }

// public class reversestring {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         String rev = "";
//         for(int i = str.length() - 1; i >= 0; i--){
//                rev += str.charAt(i);
//         }
//         System.out.println(rev);
//         sc.close();
//     }
// }

// public class reversestring {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         System.out.println(reverse(str)); 
//         sc.close();      
//     }
//     public static String reverse(String str){
//         if(str.isEmpty()){
//             return str;
//         }
//         return reverse(str.substring(1)) + str.charAt(0);
//     }
// }