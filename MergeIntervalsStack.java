import java.util.*;

public class MergeIntervalsStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];

        System.out.println("Enter intervals (start end):");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        Stack<int[]> stack = new Stack<>();
        stack.push(intervals[0]);

        for (int i = 1; i < n; i++) {
            int[] top = stack.peek();

            if (intervals[i][0] <= top[1]) {
                top[1] = Math.max(top[1], intervals[i][1]);
            } else {
                stack.push(intervals[i]);
            }
        }

        System.out.println("Merged Intervals:");
        for (int[] interval : stack) {
            System.out.println(interval[0] + " " + interval[1]);
        }

        sc.close();
    }
} 

// Merge Intervals using ArrayList (No Stack)

// import java.util.*;

// public class MergeIntervalsList {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of intervals: ");
//         int n = sc.nextInt();
//         int[][] intervals = new int[n][2];

//         System.out.println("Enter intervals (start end):");
//         for (int i = 0; i < n; i++) {
//             intervals[i][0] = sc.nextInt();
//             intervals[i][1] = sc.nextInt();
//         }

//         // Step 1: Sort intervals by start time
//         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

//         // Step 2: Use a list to merge intervals
//         List<int[]> merged = new ArrayList<>();
//         int[] current = intervals[0];
//         merged.add(current);

//         for (int i = 1; i < n; i++) {
//             if (intervals[i][0] <= current[1]) {
//                 // Overlapping → extend the end time
//                 current[1] = Math.max(current[1], intervals[i][1]);
//             } else {
//                 // Non-overlapping → add new interval
//                 current = intervals[i];
//                 merged.add(current);
//             }
//         }

//         // Step 3: Print merged intervals
//         System.out.println("Merged Intervals:");
//         for (int[] interval : merged) {
//             System.out.println(interval[0] + " " + interval[1]);
//         }

//         sc.close();
//     }
// }
