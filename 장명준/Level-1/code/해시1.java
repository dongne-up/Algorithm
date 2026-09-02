class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        int idx = 0;

        for(int i = 0 ; i < participant.length ; i ++){
            boolean found = false;
            for(int j = 0 ; j < completion.length ; j ++){
                if(participant[i].equals(completion[j])){
                    found = true;
                    break;
                }else{
                    //nothing to do here.
                }
            }
            if(found==false){
                idx = i;
                break;
            }
            idx++;
        }
        answer = participant[idx];

        return answer;
    }
}

class Test {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(sol.solution(participant, completion));
    }
}