import java.util.Scanner;
public class PeakElement {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findFirstPeak(arr, n));
        sc.close();
    }

    public static int findFirstPeak(int[] arr, int n) {
        if (n == 0) return -1;
        if (n == 1) return 0;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (arr[i] >= arr[i + 1]) {
                    return i;
                }
            } else if (i == n - 1) {
                if (arr[i] >= arr[i - 1]) {
                    return i;
                }
            } else {
                if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                    return i;
                }
            }
        }
        return -1;
    }
    
}
