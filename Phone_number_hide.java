package Programmers;


class Phone_number_hide {
	public String solution(String phone_number) {
		char[] Pn = phone_number.toCharArray();
		for(int i=0; i<Pn.length-4; i++)
			Pn[i] = '*';
		return String.valueOf(Pn);
	}
}
