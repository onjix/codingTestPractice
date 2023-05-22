import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
        String s = "";
        int cnt = 0;
        ArrayList<Integer> list= new ArrayList<Integer>();
        for (int i=l; i<= r; i++) {
            if(i % 5 == 0) {
                s = Integer.toString(i);
            for(int j=0;j<s.length();j++) {
                if(s.charAt(j) == '5' || s.charAt(j) == '0') {
                    cnt++;
                }
                else {
                    cnt -=5;
                }
            }
            if(cnt >=1) {
                list.add(i);
            }
            cnt=0;
            }
        }
        if(list.size() == 0) {
            list.add(-1);
        }
        int[] answer = new int[list.size()];
        for(int h=0;h<list.size();h++) {
            answer[h] = list.get(h);
        }
        return answer;
    }
}