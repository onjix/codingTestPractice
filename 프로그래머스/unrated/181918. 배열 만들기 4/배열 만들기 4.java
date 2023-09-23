import java.util.*;

class Solution {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int i = 0;
        while(i < arr.length) {
            if(s.empty() || s.peek() < arr[i]) {
                s.push(arr[i]);
                i++;
            } else if(s.peek() >= arr[i]) {
                s.pop();
            }
        }
        return s;
    }
}