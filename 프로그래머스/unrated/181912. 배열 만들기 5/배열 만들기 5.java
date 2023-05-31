import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> ar = new ArrayList<>();
        String numStr= "";
        int size = s+l;
        for(String st : intStrs) {
            for(int i=s;i<size;i++) {
                numStr += st.charAt(i);
            }
            int num = Integer.parseInt(numStr);
            if(num > k) {
                ar.add(num);
            }
            numStr = "";
        }
        int[] answer = new int[ar.size()];
        for(int j=0;j<ar.size();j++) {
           answer[j] = ar.get(j);
        }
        return answer;
    }
}