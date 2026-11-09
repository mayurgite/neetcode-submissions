class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int answer=0;
        for(int num : nums){
            if(num==1) count++;
            else{
                if(count>answer) answer=count;

                count=0;
            }

        }

        return answer>count?answer: count;
    }
}