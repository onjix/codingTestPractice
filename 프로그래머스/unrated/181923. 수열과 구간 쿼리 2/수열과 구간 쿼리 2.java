import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int a[] : queries) {
            int i = a[0];
            int size = a[1];
            int comp = a[2];
            ArrayList<Integer> result = new ArrayList<>();
            for(;i<=size;i++) {
                if(arr[i] > comp) {
                    result.add(arr[i]);
                }
            }
            if(!(result.isEmpty())) {
                Collections.sort(result);
                answer.add(result.get(0));
            }
            else {
                answer.add(-1);
            }
        }
        int[] fans = new int[answer.size()];
        for(int j=0;j<fans.length;j++) {
            fans[j] = answer.get(j);
        }
        
        return fans;
    }
}