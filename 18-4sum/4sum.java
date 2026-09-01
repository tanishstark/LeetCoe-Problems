class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){

                long target2 = (long)target - (long)nums[i] - nums[j]; 

                int left = j + 1;
                int right = n - 1;
                
                while(left < right){
                    int sum = nums[left] + nums[right];
                    if(sum < target2){
                        left++;
                    }else if(sum > target2){
                        right--;
                    }else{
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while(left < right && nums[left] == nums[left + 1]){
                        left++;
                        }
                        while(left < right && nums[right] == nums[right - 1]){

                        right--;
                        }

                        left++;
                        right--;
                    }
                }
                while(j + 1 < n && nums[j] == nums[ j + 1]){
                    j++;
                }
            }
            while(i + 1 < n && nums[i] == nums[i + 1]){
                i++;
            }
        }
        return ans;
    }
}