import java.util.Arrays;

public class TryCatchFinally {

	public static void main(String[] args) {
		Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).stream().skip(4).forEach((i) -> System.out.print(i + " "));
	}
}
