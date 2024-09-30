package revision.two_pointers;

public class MaxWater {
    public int maxArea(int[] heights) {
        int res = 0;
        int l = 0;
        int r = heights.length - 1;
        while (l < r) {
            int min = Math.min(heights[l] , heights[r]);
            res = Math.max(min * (r - l), res);
            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
}
