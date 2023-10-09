import java.util.*;

class Solution {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++) {
            if(s.empty() || s.peek() < arr[i] ) {
                s.push(arr[i]);
            } else {
                s.pop();
                i--;
            }
        }
        return s;
    }
}