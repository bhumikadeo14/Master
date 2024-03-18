package tutorials;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        // Initialize an array to store the number of ways for each step
        int[] ways = new int[n + 1];
        ways[1] = 1;
        ways[2] = 2;

        // Calculate the number of ways for each step using dynamic programming
        for (int i = 3; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }

        return ways[n];
    }

    public static void main(String[] args) {
        // Example usage
        int n = 6;
        int result = climbStairs(n);
        System.out.println("Number of distinct ways to climb " + n + " steps: " + result);
    }
}

