import java.util.*;

class Solution {
    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = edges.length + 1;

        // Build adjacency list
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        int[] bobtime = new int[n];
        Arrays.fill(bobtime, -1);
        boolean[] visbob = new boolean[n];
        boolean[] visalice = new boolean[n];

        // Find Bob's path and record times
        dfs(0, 0, bob, new ArrayList<>(), visbob, adj, bobtime);

        // Use an array to store max profit as reference
        int[] maxProfit = new int[]{Integer.MIN_VALUE};
        alicepath(0, 0, 0, adj, bobtime, amount, visalice, 0, maxProfit);

        return maxProfit[0];
    }

    // Alice's path to maximize profit
    public void alicepath(int time, int curr, int node, List<List<Integer>> adj, int[] bobtime,
                          int[] amount, boolean[] visalice, int profit, int[] maxProfit) {
        visalice[node] = true;

        // Profit logic based on Bob's timing
        if (bobtime[node] != -1 && time > bobtime[node]) {
            profit += 0;  // Bob has already taken the amount
        } else if (bobtime[node] != -1 && time == bobtime[node]) {
            profit += amount[node] / 2;  // Split between Alice and Bob
        } else {
            profit += amount[node];  // Alice takes full amount
        }

        // If leaf node, update maxProfit
        if (adj.get(node).size() == 1 && node != 0) {
            maxProfit[0] = Math.max(maxProfit[0], profit);
        }

        // Continue DFS for Alice
        for (int neighbor : adj.get(node)) {
            if (!visalice[neighbor]) {
                alicepath(time + 1, profit, neighbor, adj, bobtime, amount, visalice, profit, maxProfit);
            }
        }
    }

    // DFS to find Bob's path and record times
    public boolean dfs(int curr_time, int target, int node, List<Integer> path, boolean[] vis,
                       List<List<Integer>> adj, int[] bobtime) {
        vis[node] = true;
        path.add(node);
        bobtime[node] = curr_time;

        if (node == target) {
            return true;
        }

        for (int neighbor : adj.get(node)) {
            if (!vis[neighbor]) {
                if (dfs(curr_time + 1, target, neighbor, path, vis, adj, bobtime)) {
                    return true;
                }
            }
        }

        // Backtrack if not the correct path
        path.remove(path.size() - 1);
        bobtime[node] = -1;
        return false;
    }
}