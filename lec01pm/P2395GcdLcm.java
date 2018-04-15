package lec01pm;

import java.util.Scanner;

public class P2395GcdLcm {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int a=cin.nextInt();
		int b=cin.nextInt();
		System.out.println(String.format("%d %d",gcd(a,b),lcm(a,b)));
		cin.close();
		
	}

	private static int lcm(int a, int b) {		
		return a*b/gcd(a,b);
	}

	private static int gcd(int a, int b) {
		while(b!=0){
			int r = a % b;
			a=b;
			b=r;
		}
		return a;
	}

}
