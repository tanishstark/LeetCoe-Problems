class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       int count = 0;
       for(int i = 0; i < nums.length; i++){
        long multi = 1;
        for(int j = i; j < nums.length; j++){
            
            multi*=nums[j];

            if(multi >= k){
                break;
            }
            count++;
        }
       } 
    return count;
    }
}