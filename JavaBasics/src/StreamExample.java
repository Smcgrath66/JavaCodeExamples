import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Silvia", "Dan", "Mike");
		Map<Integer, String> collected = names.stream().collect(Collectors.toMap(String::length, String::toUpperCase));
		System.out.println(collected);
	}

}
