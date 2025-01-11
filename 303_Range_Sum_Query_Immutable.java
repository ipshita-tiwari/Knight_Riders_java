class NumArray {
    int [] PrifixSum = new int[10000] ;

    public NumArray(int[] nums) {
        PrifixSum[0]=nums[0];
     for(int i = 1;i<nums.length;i++){
        PrifixSum[i]=PrifixSum[i-1]+nums[i];
     }

    }
    
    public int sumRange(int left, int right) {
        
        if(left==0){
            return ( PrifixSum[right]);
        }

       return( PrifixSum[right]-PrifixSum[left-1]);  
    }
   
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */