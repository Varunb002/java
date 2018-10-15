package com.uttara.codeeval;

public class ATM {
	
	public static boolean isATM(String s) {
		int j=0,sum1=0,sum2=0, k=0;
		String l;
		for (int i = 0; i < s.length(); i++) {
			if (i%2==0) {
				j = s.charAt(i)-'0';
				j = j*2;
				l = j+"";
				if (l.length()>1)
				{
					k = j%10;
					j = j/10;
					j = k+j;
				}
				sum1=sum1+j;
			}
			else {
				j = s.charAt(i)-'0';
				sum2=sum2+j;
			}
			}
	if ((sum1+sum2)%10!=0)
		return false;
	return true; 
	}


}
