class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
                int[] prefixSum = new int[102];

        
        for (List<Integer> range : nums) {
            int start = range.get(0); 
            int end = range.get(1);   
            prefixSum[start] += 1;    
            prefixSum[end + 1] -= 1;  
        }

        
        int count = 0, currentCoverage = 0;
        for (int i = 0; i <= 100; i++) {
            currentCoverage += prefixSum[i]; 
            if (currentCoverage > 0) {      
                count++;
            }
        }

        return count;
    }
}

    