import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Polymorphism {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("a", "b", "c"));
		List<String> linkedList = new LinkedList<>(Arrays.asList("d", "e", "f"));
		printList(arrayList);
		printList(linkedList);
	}

	public static void printList(List<String> list) {
		for (String elem : list) {
			System.out.println(elem);
		}
	}

}
