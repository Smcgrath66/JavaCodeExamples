public class Strings {

	public static void main(String[] args) {
		compare("Hello", "Hello");
		compare(200, 200);
	}

	private static void compare(String s1, String s2) {
		if (s1 == s2) {
			System.out.println("s1.equals(s2)");
		} else if (s1.equals(s2)) {
			System.out.println("s1.equals(");
		}
	}

	private static void compare(Integer i1, Integer i2) {
		if (i1 == i2) {
			System.out.println("i1.equals(i2)");
		} else if (i1.equals(i2)) {
			System.out.println("i1.equals(i2)");
		}
	}

}
