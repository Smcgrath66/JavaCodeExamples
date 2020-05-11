import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class NOIExample {
	public static void main(String[] args) throws IOException {
//		List<String> lines = Files.readAllLines(Paths.get("origin.txt"));
//		List<Integer> numbers = new ArrayList<>();
//		List<String> letters = new ArrayList<>();
		List<String> letters = Arrays.asList("A", "B", "C");
//		List<Integer> integers = Arrays.asList(4, 5, 2, 1, 5, 7);
//		Collections.sort(integers, (o1, o2)) -> o2 - o1);
//		letters.add("A");
//		letters.add("E");
//		letters.add("B");
		letters.add("G");
		System.out.println(letters);
//		String fourth = letters.get(3);
//		System.out.println(fourth);
//		System.out.println("CURRENT LETTERS " + letters);
//		sortStrings(letters);
//	    numbers.add(2);
//		numbers.add(4);
//		numbers.add(6);
//		numbers.add(3);
//		sortNumbers(numbers);
	}

//	private static void sortNumbers(List<Integer> numbers) {
//		if (numbers.size() > 0) {
//			numbers.sort(Comparator.naturalOrder());
//			System.out.println("After sort " + numbers);
//		} else {
//			System.out.println("Nothing to see here and no zeros dumbass");
//		}
//	}
//
//	private static void sortStrings(List<String> inString) {
//		if (inString.size() > 0) {
//			inString.sort(Comparator.naturalOrder());
//			System.out.println("After sort " + inString);
//		} else {
//			System.out.println("Nothing to see here and no zeros dumbass");
//		}
//	}
}
