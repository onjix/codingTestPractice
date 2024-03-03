import java.util.*;

public class Solution {
    public Object[] solution(int []arr) {
        // Object[] answer = {};
        Stack<Integer> s = new Stack<>();
        for (int a: arr) {
            if (s.isEmpty()) {
                s.add(a);
            }
            else {
                if (s.peek() == a) {
                    continue;
                } else {
                    s.add(a);
                }
            }
        }
        // answer = s.toArray();
        return s.toArray();
    }
}