import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        String[] str1 = today.split("[.]");
        ArrayList<Integer> list = new ArrayList<>();
        int totalValue = 0;
        int index = 0;
        String[] d = {};
        int size = 0;
        for(int i=0;i<privacies.length;i++) {
            String[] date = privacies[i].split(" ");
            String[] str2 = date[0].split("[.]");
            int num = Integer.parseInt(str1[0]) - Integer.parseInt(str2[0]); 
            if(num > 0) {
                int n1 = ((num*336 + Integer.parseInt(str1[1])*28 + Integer.parseInt(str1[2])));
                int n2 = Integer.parseInt(str2[1])*28 + Integer.parseInt(str2[2]);
                totalValue = n1 - n2;
                
            }
            else {
                int n1 = Integer.parseInt(str1[1])*28 + Integer.parseInt(str1[2]);
                int n2 = Integer.parseInt(str2[1])*28 + Integer.parseInt(str2[2]);
                totalValue = n1 - n2;
            }
            for(int j=0;j<terms.length;j++) {
                d = terms[j].split(" ");
                 if(d[0].equals(date[1])) {
                    size = Integer.parseInt(d[1]) *28;
                }
            }
            if(totalValue >= size) {
                list.add(i+1);
            }
        }
        // int arrListSize = list.size();
        int[] answer = list.stream()
                .mapToInt(i -> i)
                .toArray();

        return answer;
    }
}