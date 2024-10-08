//leetcode 74
//Meant to work in leetcode


public class sortedarray {

    
        // Function to search for the target in a 2D matrix
        public boolean searchMatrix(int[][] matrix, int target) {
            int rows = matrix.length; // Number of rows in the matrix
            int cols = matrix[0].length; // Number of columns in the matrix
    
            int start = 0; // Starting index in virtual 1D array
            int end = rows * cols - 1; // Ending index in virtual 1D array
    
            // Perform binary search
            while (start <= end) {
                int mid = start + (end - start) / 2; // Find the middle index
                int midValue = matrix[mid / cols][mid % cols]; // Get the value at the middle index
    
                if (midValue == target) {
                    return true; // Target found
                } else if (target < midValue) {
                    end = mid - 1; // Search in the left half
                } else {
                    start = mid + 1; // Search in the right half
                }
            }
            return false; // Target not found
        }
    
        public static void main(String[] args) {
            Solution sol = new Solution();
            int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
            };
            int target = 3;
            boolean result = sol.searchMatrix(matrix, target);
            System.out.println(result); // Output: true
        }
    }
    
    

