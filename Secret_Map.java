package Programmers;

public class Secret_Map {
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] s_arr1 = new String[n]; 
        String[] s_arr2 = new String[n];
        StringBuilder sb;
        for(int i=0;i<n; i++) {
        	s_arr1[i] = Integer.toBinaryString(arr1[i]);
        	s_arr2[i] = Integer.toBinaryString(arr2[i]);
        }
        for(int i=0; i<n; i++) {
        	if(n-s_arr1[i].length()!=0) {
        		sb = new StringBuilder();
        		for(int j=0; j<n-s_arr1[i].length(); j++) 
        			sb.append("0");
        		sb.append(s_arr1[i]);
        		s_arr1[i]=sb.toString();
        	}
        	if(n-s_arr2[i].length()!=0) {
        		sb = new StringBuilder();
        		for(int j=0; j<n-s_arr2[i].length(); j++) 
        			sb.append("0");
        		sb.append(s_arr2[i]);
        		s_arr2[i]=sb.toString();
        	}
        }
        
        for(int i=0; i<n; i++) {
        	char[] c_arr1 = s_arr1[i].toCharArray();
        	char[] c_arr2 = s_arr2[i].toCharArray();
        	sb = new StringBuilder();
        	for(int j=0; j<n; j++) {
        		if((int)c_arr1[j]==49||(int)c_arr2[j]==49) {
        			sb.append("#");
        		}
        		else 
        			sb.append(" ");
        	}
        	s_arr1[i] = sb.toString();
        }
        
        return s_arr1;
    }
}
