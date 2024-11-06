class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int i = 0;
        while (i < arr.length) {
            // Check if the current plot is empty and its neighbors are also empty or out of bounds
            if (arr[i] == 0 && (i == 0 || arr[i - 1] == 0) && (i == arr.length - 1 || arr[i + 1] == 0)) {
                // Place a flower here
                arr[i] = 1;
                n--; // Reduce the count of flowers needed
                
                // If we’ve placed all flowers needed, return true
                if (n <= 0) return true;
                
                // Skip the next spot since we can't place adjacent flowers
                i += 2;
            } else {
                // Move to the next plot
                i++;
            }
        }
        
        // If we couldn't place all the flowers, return false
        return n <= 0;
    }
}