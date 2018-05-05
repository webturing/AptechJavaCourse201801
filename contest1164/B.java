package contest1164;

public class B {
	public static void main(String[] args) {
		String s = "124lfdk54AIEJ92854&%$GJ";
		System.out.println(s.replaceAll("[^a-zA-Z]", "").length());
	}
}
