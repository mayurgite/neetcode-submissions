class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int answer=0;
        for(int num : nums){
            if(num==1){
                count++;
                answer = Math.max(answer,count);
            } else count = 0;
        }

        return answer;
    }
}