package Programmers;

class ī�� {
    public int[] solution(int brown, int yellow) {
        
        int y_���μ����� = (brown-4)/2;
        int n1 = y_���μ�����-1, n2 = 1;
        
        while(n1*n2!=yellow){
            n1--; n2++;
        }
        
        int[] answer = {n1+2, n2+2};
        
        return answer;
    }
}
