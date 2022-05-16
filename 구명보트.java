package Programmers;

// 시간초과 났음 deque로 풀어야 할듯
import java.util.*;
import java.util.stream.*;
class 구명보트 {
    static boolean check_end = false;
    static int answer = 0;
    public int solution(int[] people, int limit) {
        List<Integer> list = Arrays.stream(people).parallel().boxed().collect(Collectors.toList());
        Collections.sort(list, Collections.reverseOrder());
        int count = 0;
        while(!list.isEmpty()) {
            if(check(list.get(0), list, limit) == true) {
                if(check_end==true){
                    answer+=list.size();
                    break;
                }
                answer++;
            }
            else {
                if(check_end==true){
                    answer+=list.size();
                    break;
                }
                list.remove(0);
                answer++;
            }
            count++;
        }
        return answer;
    }
    public boolean check(int w, List<Integer> list, int limit) {
        boolean result = false;
        if(list.size()==1) return false;
        if(w+list.get(list.size()-1)>limit) return false;
        for(int i=1; i<list.size(); i++) {
            if(limit-w >= list.get(i)) {
                list.remove(list.indexOf(list.get(i)));
                list.remove(0);
                return true;
            }
        }
        return result;
    }
}
