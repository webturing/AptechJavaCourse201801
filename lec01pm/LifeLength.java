package lec01pm;

public class LifeLength {
	public static void main(String[] args) {
		System.out.println(100 * 365 * 24 * 3600 * 1000 * 1L);// error
		System.out.println(1L * 100 * 365 * 24 * 3600 * 1000);// ok
	}
}
