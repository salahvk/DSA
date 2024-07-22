package leetcode._11;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights = { 1, 7, 2, 5, 4, 7, 3, 6 };
        System.out.println(maxArea(heights));
    }

    public static int maxArea(int[] heights) {
        int maxArea = 0;
        int i = 0;
        int j = heights.length - 1;

        while (i < j) {
            if (heights[i] <= heights[j]) {
                if (maxArea < heights[i] * (j - i)) {
                    maxArea = heights[i] * (j - i);
                }
                i++;
            } else if (heights[j] < heights[i]) {
                if (maxArea < heights[j] * (j - i)) {
                    maxArea = heights[j] * (j - i);
                }
                j--;
            }
        }
        return maxArea;
    }
}
