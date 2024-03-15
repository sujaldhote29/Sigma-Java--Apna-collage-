class Solution {
    public static int[] searchRange(int[] nums, int target) {
       
        int start = 0;
        int end = nums.length - 1;
      while(start<=end){
          if(nums[start]==target  && nums[end]==target){
              return new int[] { start, end};
          }
          if(nums[start]<target && nums[end]> target){
              start++;
              end--;
          }
      }
      return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        int result[] = searchRange(arr, 8);
        System.out.println(result);
    }
}