import java.util.HashMap;

class Solution1 {
    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//
//        int idx = 0;
//
//        for(int i = 0 ; i < participant.length ; i ++){
//            boolean found = false;
//            for(int j = 0 ; j < completion.length ; j ++){
//                if(participant[i].equals(completion[j])){
//                    found = true;
//                    break;
//                }else{
//                    //nothing to do here.
//                }
//            }
//            if(found==false){
//                idx = i;
//                break;
//            }
//            idx++;
//        }
//        answer = participant[idx];
//
//        return answer;
        HashMap<String, Integer> map = new HashMap<>();

        // 1. participant를 map에 넣으면서 이름별 등장 횟수를 센다
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        // 2. completion에 있는 이름은 카운트를 하나씩 뺀다
        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }

        // 3. 카운트가 0보다 큰(=완주 못한) 사람을 찾는다
        for (String name : participant) {
            if (map.get(name) > 0) {
                return name;
            }
        }

        return ""; // 여기 도달하면 안 됨
    }
}


class Test1 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(sol.solution(participant, completion));
    }
}