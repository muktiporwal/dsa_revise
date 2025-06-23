import java.util.Scanner;

public class solution {
    public static long kMirror(int k, int n) {
        long sum = 0;
        int count = 0;
        int length = 1;

        while (count < n) {
            int half = (length + 1) / 2;
            long start = (long) Math.pow(10, half - 1);
            long end = (long) Math.pow(10, half);

            for (long i = start; i < end; i++) {
                String firstHalf = Long.toString(i);
                StringBuilder sb = new StringBuilder(firstHalf);
                if (length % 2 == 1) {
                    sb.setLength(sb.length() - 1);
                }
                String palindromeStr = firstHalf + sb.reverse();
                long palindrome = Long.parseLong(palindromeStr);

                String baseK = "";
                long temp = palindrome;
                while (temp > 0) {
                    baseK = (temp % k) + baseK;
                    temp /= k;
                }

                boolean isPalin = true;
                int left = 0, right = baseK.length() - 1;
                while (left < right) {
                    if (baseK.charAt(left++) != baseK.charAt(right--)) {
                        isPalin = false;
                        break;
                    }
                }

                if (isPalin) {
                    sum += palindrome;
                    count++;
                    if (count == n) return sum;
                }
            }
            length++;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of k:");
        int k=sc.nextInt();
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println(kMirror(k, n));
    }
}
