import java.util.ArrayList;
class Solution {
    public int[] solution(int start, int end) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = start;i<=end;i++) {
            list.add(i);
        }
        int[] answer = new int[list.size()];
        for(int j=0;j<list.size();j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}