class Solution {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        
        int n = candiesCount.length;
        long[] prefixSum = new long[n];
        prefixSum[0] = candiesCount[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + candiesCount[i];
        }

        int q = queries.length;
        boolean[] answer = new boolean[q];

        for (int i = 0; i < q; i++) {
            int[] query = queries[i];
            int favType = query[0];
            int favDay = query[1];
            int dailyCap = query[2];

           
            long minCandiesRequired = favDay + 1; 
            long maxCandiesEatable = (long) (favDay + 1) * dailyCap;

          
            long candiesStart = (favType == 0) ? 1 : prefixSum[favType - 1] + 1;
            long candiesEnd = prefixSum[favType];

        
            answer[i] = !(minCandiesRequired > candiesEnd || maxCandiesEatable < candiesStart);
        }

        return answer;
    }
}
