// import java.util.Scanner;

// public class longestSubstring {
//     // Function to check if substring has all unique chars
//     static boolean allUnique(String str, int start, int end) {
//         boolean[] visited = new boolean[256]; // ASCII chars
//         for (int i = start; i <= end; i++) {
//             if (visited[str.charAt(i)]) return false;
//             visited[str.charAt(i)] = true;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String s = sc.nextLine();

//         int n = s.length();
//         int maxLen = 0;

//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 if (allUnique(s, i, j)) {
//                     maxLen = Math.max(maxLen, j - i + 1);
//                 }
//             }
//         }

//         System.out.println("Length of longest substring without repeating characters: " + maxLen);

//         sc.close();
//     }
// }


// import java.util.*;
// public class longestSubstring {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a string");
//         String str = sc.next();

//         Set<Character> set = new HashSet<>();
//         int left = 0, maxLen = 0;

//         for(int right = 0; right < str.length(); right++){
//             while (set.contains(str.charAt(right))) {
//                 set.remove(str.charAt(left));
//                 left ++;
//             }
//             set.add(str.charAt(right));
//             maxLen = Math.max(maxLen, right - left + 1);
//         }
//         System.out.println("Length of the substring : " + maxLen);
//         sc.close();
//     }
// }

import java.util.*;

public class longestSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();  // take full line input

        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0, start = 0;

        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));

            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                start = left;
            }
        }

        String longest = str.substring(start, start + maxLen);

        System.out.println(maxLen);
        System.out.println(longest);

        sc.close();
    }
}

