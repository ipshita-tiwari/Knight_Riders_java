class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[] =new int [2];
        int flag=0;
        for (int i =0;i<nums.length;i++){
            if(flag==1) 
              break;
             for (int j =0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i]+nums[j]==target){
                   a[0]=i;
                   a[1]=j;
                   flag=1;
                    }


                }
            
        }
    }
    return a;
        }
    }
