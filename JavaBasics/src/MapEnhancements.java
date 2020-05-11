import java.util.HashMap;
import java.util.Map;

public class MapEnhancements {

	public static void main(String[] args) {
		Map<String, Integer> namesCountMap = new HashMap<String, Integer>() {
			{
				put("John", 5);
				put("Mike", 4);
				put("Luke", 15);
				put("Paul", 1);
			}
		};

		Integer ifPresent = namesCountMap.computeIfPresent("John", (key, value) -> key.length() + value);
//		Integer ifAbsent = namesCountMap.computeIfAbsent("Joshua", (key, value) -> key.length());
		System.out.println(ifPresent);
	}

}
