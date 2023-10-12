class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String[] ar = new String[my_string.length()];
        String str = "";
        for(int i=0;i<my_string.length();i++) {
            for(int j=0;j<=i;j++) {
                str += my_string.charAt(j);
            }
            // System.out.println(str);
            ar[i] = str;
            str = "";
        }
        for(int i=0;i<ar.length;i++) {
            if(ar[i].equals(is_prefix)) {
                answer = 1;
            }
        }
        return answer;
    }
}