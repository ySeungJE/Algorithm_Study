package Programmers;

class 카펫 {
    public int[] solution(int brown, int yellow) {
        
        int y_가로세로합 = (brown-4)/2;
        int n1 = y_가로세로합-1, n2 = 1;
        
        while(n1*n2!=yellow){
            n1--; n2++;
        }
        
        int[] answer = {n1+2, n2+2};
        
        return answer;
    }
}
