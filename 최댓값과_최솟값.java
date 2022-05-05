package Programmers;

class ÃÖ´ñ°ª°ú_ÃÖ¼Ú°ª {
    public String solution(String s) {
        String[] num_arr = s.split(" ");
        String min = String.valueOf(Integer.MAX_VALUE); 
        String max = String.valueOf(Integer.MIN_VALUE);
        String answer = "";

        for(String n : num_arr) {
            if(Integer.parseInt(n) < Integer.parseInt(min)) min = n;
            if(Integer.parseInt(n) > Integer.parseInt(max)) max = n;
        }

        answer = answer + min + " " + max;

        return answer;
    }
}
