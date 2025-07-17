import java.util.*;
public class validSubstring{
    public static int longestValidSubsequence(int[] nums, int k) {
        int n = nums.length;

        int[][] dp = new int[n][k];
        int maxLen = 1;

        for (int i = 0; i < n; i++) {
            for (int mod = 0; mod < k; mod++) {
                dp[i][mod] = 1;
            }

            for (int j = 0; j < i; j++) {
                int mod = (nums[j] + nums[i]) % k;
                dp[i][mod] = Math.max(dp[i][mod], dp[j][mod] + 1);
                maxLen = Math.max(maxLen, dp[i][mod]);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k=sc.nextInt();
        System.out.println("Longest valid subsequence length: " + longestValidSubsequence(nums, k));
    }
}
