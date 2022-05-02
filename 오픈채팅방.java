package Programmers;

import java.util.*;

class 오픈채팅방 {
    public static String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        StringTokenizer st;
        for(String s : record) {
            st = new StringTokenizer(s, " ");
            String order = st.nextToken();
            if(order.equals("Enter") || order.equals("Change")) {
                map.put(st.nextToken(), st.nextToken());
            }
        }
        List<String> list = new ArrayList<>();
        for(String s : record) {
            st = new StringTokenizer(s, " ");
            String order = st.nextToken();
            String now_id = st.nextToken();
            if(order.equals("Enter"))
                list.add(map.get(now_id)+"님이 들어왔습니다.");
            else if(order.equals("Leave"))
                list.add(map.get(now_id)+"님이 나갔습니다.");
        }
        String[] answer = new String[list.size()];
        list.toArray(answer);
        return answer;
    }
}
