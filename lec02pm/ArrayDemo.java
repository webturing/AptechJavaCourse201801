package lec02pm;

import java.util.Arrays;

public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a={1,2,3};//Array initializer better 
		int b[]={3,4,5};//poor
		int[] c=new int[3];
		//c={3,4,5};//wrong
		int[]d=a;//d and a refer same object
		d[0]++;
		System.out.println(a[0]);
		int [] e=a.clone();
		e[0]++;
		System.out.println(a[0]);//2
		int [] f=new int[a.length];
		f[0]=a[0];
		f[1]=a[1];
		f[2]=a[2];
		int[] g;//g.length=0; g=null
		
		//Output
		//1 Access by Index
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
		System.out.println();
		//2 Foreach 
		for(int i:b){
			System.out.print(i);
		}
		System.out.println();
		//3 Arrays.toString(arr) debug memory dump
		System.out.println(c);
		System.out.println(Arrays.toString(c));
	}

}
