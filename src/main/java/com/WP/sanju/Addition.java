package com.WP.sanju;

public class Addition {

	public int add(int a, int b) {
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		
		Addition a=new Addition();
		int aa = a.add(20, 15);
		System.out.println(aa);
	}
}
