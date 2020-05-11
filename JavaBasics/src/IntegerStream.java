import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegerStream {

	public static void main(String[] args) {

		Stream<Integer> stream = IntStream.range(1, 10).boxed();
//		String even = stream.filter(i -> i % 2 == 0).map(String::valueOf).collect(Collectors.joining(", "));
		String odd = stream.filter(i -> i % 2 != 0).map(String::valueOf).collect(Collectors.joining(", "));
//		System.out.println(even);
		System.out.println(odd);
	}

}
