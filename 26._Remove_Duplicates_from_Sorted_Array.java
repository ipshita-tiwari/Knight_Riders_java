class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int l = 0; 
        int r = 1;   
        int k = 1;  

        while (r < nums.length) {
            if (nums[l] != nums[r]) {
                nums[k] = nums[r]; 
                l = r;             
                k++;
            }
            r++; 
        }
        return k;
    }
}
