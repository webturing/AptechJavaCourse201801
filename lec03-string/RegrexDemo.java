import java.util.Arrays;

public class RegrexDemo {
	public static void main(String[] args) {
		char[] hex = "0123456789ABCDEF".toCharArray();
		System.out.println(Arrays.toString(hex));
		String[] cards = "A 2 3 4 5 6 7 8 9 10 J Q K".split(" ");
		System.out.println(Arrays.toString(cards));
		String clause = "To know,  Everything. ##is to know nothing?";
		System.out.println(Arrays.asList(clause.toLowerCase()
				.replaceAll("\\.|,|\\?", "").split("\\s+")));
		// System.out.println(Arrays.asList("everything".split("e")));
		System.out.println("asjkdfjka1728378912SKJDFJKL%$^&**(&&*(".replaceAll(
				"[a-zA-Z]", ""));
		System.out.println("asjkdfjka1728378912SKJDFJKL"
				.replaceAll("[0-9]", ""));
		System.out.println("asjkdfjka1728378912SKJDFJKL".replaceAll("\\d", ""));
		System.out.println("asjkdfjka1728378912SKJDFJKL%$^&**(&&*(".replaceAll(
				"\\D", ""));

		System.out.println(clause.replaceAll("[^a-zA-Z]+", " "));
		System.out.println(Arrays.asList(clause.toLowerCase().split(
				"[^a-zA-Z]+")));
		System.out.println("zj@Webturing.com".matches("\\w+@\\w+.\\w+"));
		String tel = "13812345678";
		System.out.println(tel.length() == 11 && tel.matches("^1\\d+8$"));
		String date = "20180506";

	}
}
