import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            if(arr[i] % divisor == 0) {
                answer.add( arr[i]);
            }
        }
        if(answer.size() == 0 ) {
            answer.add(-1);
        } else {
            Collections.sort(answer);
        }
        return answer;
    }
}