import java.util.Stack;
import java.util.Arrays;
class Solution {
    public String reverse(String str, int n, int k) {
        String ans = "";
        String[] ch = str.split("");
        Stack<String> stack = new Stack<>();
        for(int i=n;i<=k;i++) {
            stack.push(ch[i]);
        }
        
        for(int j=n;j<=k;j++) {
            ch[j] = stack.pop();
        }
        
        for(int h=0;h<ch.length;h++) {
            ans += ch[h];
        }
        
        return ans;
    }
    
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        for(int[] value : queries) {
            answer = reverse(answer, value[0], value[1]);
        }
        return answer;
    }
}