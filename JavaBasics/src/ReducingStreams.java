import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReducingStreams {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(10, 20, 30);
		Integer result = integers.stream().reduce(100, (a, b) -> a + b, (a, b) -> a + b);
//		System.out.println(result);

		Stream<String> parallelStream = Stream.of("John", "Silvia", "Dan", "Mike").parallel();

//		parallelStream.forEach(System.out::println);
//		parallelStream.peek(System.out::println);
//		parallelStream.forEachOrdered(System.out::println);
//		parallelStream.sequential().forEach(System.out::println);
//		parallelStream.ordered().forEach(System.out::println);

//		Map<String, Integer> namesCountMap = new HashMap<String, Integer>() {
//			{
//				put("John", 5);
//				put("Mike", 4);
//				put("Mike", 15);
//				put("Mike", 1);
//			}
//		};

//		int sum = namesCountMap.entrySet().stream().mapToInt(Map.Entry::getValue).sum();

//		int sum = namesCountMap.entrySet().stream().map(Map.Entry::getValue).mapToInt(value -> value).sum();
//		int sum = namesCountMap.entrySet().stream().mapToInt(value -> Integer.valueOf(value.getKey())).sum();
//		int sum = namesCountMap.entrySet().stream().mapToInt(Map.Entry::getValue).count();
//		System.out.println(sum);

		Stream<String> stream = Stream.of("Java", "C#", "Python", "JavaScript");

//A		double average = stream.mapToInt(String::length).average().orElse(0);
//B	    double average = stream.mapToInt(String::length).average();
//C		double average = stream.mapToInt(String::length).summaryStatistics().getAverage();
//D	    double average = stream.mapToInt(String::length).summaryStatistics().average();
		double average = stream.mapToInt(String::length).count();

		System.out.println(average);

	}

}
