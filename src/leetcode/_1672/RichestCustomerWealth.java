package leetcode._1672;

// 1672. Richest Customer Wealth
// https://leetcode.com/problems/richest-customer-wealth/description/

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = { { 3, 5, 8 }, { 6, 8, 9 }, { 3, 3, 3 } };
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int highestWealth = 0;
        int totalWealth = 0;
        for (int row = 0; row < accounts.length; row++) {
            for (int col = 0; col < accounts[row].length; col++) {
                totalWealth += accounts[row][col];
            }
            if (totalWealth > highestWealth) {
                highestWealth = totalWealth;
            }
            totalWealth = 0;
        }
        return highestWealth;
    }
}
