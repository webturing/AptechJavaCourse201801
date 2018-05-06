package contest1166;

public class C {
	public static void main(String[] args) {
		String s="I want an Accepted!";
		char[] cs=s.toCharArray();
		
		for (int i = 0; i < cs.length; i++) {
			if(Character.isUpperCase(cs[i]))				
				cs[i]=Character.toLowerCase(cs[i]);//cs[i]+=32;
			else if(Character.isLowerCase(cs[i]))
				cs[i]=Character.toUpperCase(cs[i]);	
			
		}
		
		System.out.println(new String(cs));
	}

}
