public class TrappingRainWater {
    public static int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n]; // Array to store the maximum height on the left of each bar
        int[] rightMax = new int[n]; // Array to store the maximum height on the right of each bar

        // Compute the maximum height on the left of each bar
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Compute the maximum height on the right of each bar
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int waterTrapped = 0;

        // Compute the amount of water trapped at each bar
        for (int i = 0; i < n; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            waterTrapped += minHeight - height[i];
        }

        return waterTrapped;
    }

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int waterTrapped = trap(height);

        System.out.println("Water Trapped: " + waterTrapped);
    }
}
