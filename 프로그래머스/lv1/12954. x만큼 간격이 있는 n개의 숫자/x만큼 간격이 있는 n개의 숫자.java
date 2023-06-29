import java.util.ArrayList;
class Solution {
    public long[] solution(int x, int n) {
        ArrayList<Long> list = new ArrayList<>();
        long plusNum = 0;
        for(int i=0;i<n;i++) {
            plusNum += x;
            list.add(plusNum);
        }
        long[] answer = new long[list.size()];
        for(int j=0;j<list.size();j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}