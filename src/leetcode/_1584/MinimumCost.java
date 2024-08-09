package leetcode._1584;

import java.util.Comparator;
import java.util.PriorityQueue;

class MinimumCost {
    public static int minCostConnectPoints(int[][] points) {
        int n = points.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        boolean[] inMST = new boolean[n];
        int totalCost = 0;
        int edgesSelected = 0;
        pq.offer(new int[] { 0, 0 });

        while (edgesSelected < n) {
            int[] top = pq.poll();
            int cost = top[0];
            int pointIndex = top[1];

            if (inMST[pointIndex]) {
                continue;
            }

            inMST[pointIndex] = true;
            edgesSelected++;
            totalCost += cost;

            for (int i = 0; i < n; i++) {
                if (!inMST[i]) {
                    int nextCost = Math.abs(points[pointIndex][0] - points[i][0])
                            + Math.abs(points[pointIndex][1] - points[i][1]);
                    pq.offer(new int[] { nextCost, i });
                }

            }
        }
        return totalCost;
    }

    public static void main(String[] args) {

        int[][] points = { { 0, 0 }, { 2, 2 }, { 3, 10 }, { 5, 2 }, { 7, 0 } };

        // Running the algorithm
        int result = minCostConnectPoints(points);

        // Output the result
        System.out.println("The minimum cost to connect all points is: " + result);
    }
}
