class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int j=1;
        //int nums1[]= new int[nums.length];
        //nums1[0]=nums[0];
        for(int i=1;i<nums.length;i++){
             if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                k+=1;
                j+=1;
             }
             
             
        }
        return(k);
    }
}