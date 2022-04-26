package java_base;

public class Test {
    public static void main(String[] args) {
        int[] dp = new int[20];
        dp[0] = 1;
        dp[1] = 1;
        for (int x = 2; x < dp.length; x++) {
            dp[x] = dp[x - 2] + dp[x - 1];
        }
        System.out.println(dp[dp.length - 1]);
    }
}
