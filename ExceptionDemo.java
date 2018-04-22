import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {			
		for (Scanner cin = new Scanner(System.in);
				cin.hasNext();
				System.out.println(check(cin.nextLine().split("\\."))));

	}
	private static boolean check(String[] ss) {
		if (ss.length != 4)
			return false;
		for (String s : ss)
			if (!check(s))
				return false;
		return true;
	}
	private static boolean check(String s) {
		int ip = 0;
		try {
			ip = Integer.parseInt("asdasd");
		} catch (Exception e) {
			return false;
		}
		return ip <= 255 && ip >= 0;
	}
}
