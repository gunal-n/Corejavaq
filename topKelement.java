import java.util.*;

public class topKelement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        // Step 1: Count frequency of each element
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort elements by frequency
        List<Integer> result = new ArrayList<>(freqMap.keySet());
        result.sort((a, b) -> freqMap.get(b) - freqMap.get(a)); // descending order

        // Step 3: Take first k elements
        System.out.println("Top " + k + " frequent elements: " + result.subList(0, Math.min(k, result.size())));

        sc.close();
    }
}

