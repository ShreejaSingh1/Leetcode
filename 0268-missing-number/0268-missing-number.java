class Solution {
    public int missingNumber(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
        }
        sum2=nums.length*(nums.length+1)/2;
        return sum2-sum1;
        
    }
}