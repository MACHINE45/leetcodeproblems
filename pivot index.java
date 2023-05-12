class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0,i,lsum=0,rsum=0;
        for(i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        rsum=sum;
        for(i=0;i<nums.length;i++){
            rsum-=nums[i];
            if(lsum==rsum){
                return i;
            }
            lsum+=nums[i];
        }
        return -1;
    }
}
