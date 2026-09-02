import java.util.*;

class Solution2 {
    public int solution(int[] nums) {
        int answer = 0;

        HashSet<Integer> type = new HashSet<>();

        for(int i = 0; i < nums.length; i++)
            type.add(nums[i]);
        if(type.size() >= nums.length / 2)
            answer = nums.length / 2;
        else
            answer = type.size();

        return answer;
    }
}

class Test2 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] nums = {3, 1, 2, 3};
        System.out.println(sol.solution(nums)); // 3이 나오면 정답
    }
}