package lec01pm;

import java.util.Scanner;

public class P1274Sort3C {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();
		if(a>b){int t=a;a=b;b=t;}
		if(b>c){int t=b;b=c;c=t;}
		if(a>b){int t=a;a=b;b=t;}
		System.out.println(String.format("%d %d %d", a, b, c));
		cin.close();

	}
}
