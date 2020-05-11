import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Key, String> map = new HashMap<>();

		Key key1 = new Key(1, 1);
		map.put(key1, "key1");
		System.out.println(map.get(key1));

		key1.setA(2);
		key1.setB(2);

		System.out.println(map.get(key1));
	}

}

class Key {
	private int a;
	private int b;

	public Key(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void setB(int i) {
		this.b = i;
	}

	public void setA(int i) {
		this.a = i;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Key key = (Key) o;
		if (a != key.a)
			return false;
		return b == key.b;
	}

	@Override
	public int hashCode() {
		int result = a;
		result = 31 * result + b;
		return result;
	}

}
