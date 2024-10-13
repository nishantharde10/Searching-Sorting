// Simpler Leetcode solution


// class Solution {
//     public int maximumWealth(int[][] accounts) {
//         int res = 0;
//         for(int i =0;i<accounts.length;i++){
//             int temp = 0;
//             for(int j = 0;j<accounts[i].length;j++){
//                 temp+=accounts[i][j];
//             }
//             res = Math.max(res,temp);
//         }
//         return res;
//     }
// }

// solution to work in Code editor

public class Highwealth {

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;  // To store the maximum wealth found
        
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int amount = 0; amount < accounts[person].length; amount++) {
                sum += accounts[person][amount];  // Sum the money for each bank account
            }
            maxWealth = Math.max(maxWealth, sum);  // Update maxWealth if the current sum is larger
        }
        
        return maxWealth;  // Return the maximum wealth found
    }

    public static void main(String[] args) {
        // Predefined 2D array for customers' wealth
        int[][] accounts = {
            {1, 2, 3}, // Customer 1's wealth in 3 banks
            {3, 2, 1}, // Customer 2's wealth in 3 banks
            {7, 1, 14}, // Customer 3's wealth in 3 banks
        };

        // Call the function and print the result
        int result = maximumWealth(accounts);
        System.out.println("The richest customer's wealth is: " + result);
    }
}
