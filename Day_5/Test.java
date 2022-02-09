package java_ATCS;

public class Test {

	public static void main(String[] args) {
		String s = "abcdefg";
		
		System.out.println(s.toUpperCase());
		System.out.println(s.charAt(0));
		System.out.println(s.compareTo("acb"));
		System.out.println(s.concat("hijkl"));
		System.out.println(s.contains("a"));
		System.out.println(s.endsWith("g"));
		System.out.println(s.indexOf("a"));
		System.out.println(s.isEmpty());
		System.out.println(s.replace('a', 'z'));
		System.out.println(s.length());
		System.out.println(s.startsWith("a"));
	}

}
