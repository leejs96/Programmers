import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // HashSet은 키 중복 X
        int len = nums.length;
        
        for(int i = 0; i < len; i++) {
            set.add(nums[i]);
        }
        
        return len / 2 <= set.size() ? len / 2 : set.size();  // Math.min(len / 2, set.size());
    }
}
