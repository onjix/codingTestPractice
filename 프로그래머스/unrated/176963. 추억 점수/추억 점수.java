import java.util.ArrayList;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        ArrayList<Integer> list = new ArrayList<>();
        for(String[] p : photo) {
            int sum =0;
            for(int i=0;i<p.length;i++) {
                for(int j=0;j<name.length;j++) {
                    if(p[i].equals(name[j])) {
                        sum += yearning[j];
                    }
                }
            }
            list.add(sum);
        }
        int[] answer = new int[list.size()];
        for(int h=0;h<list.size();h++) {
            answer[h] = list.get(h);
        }
        return answer;
    }
}