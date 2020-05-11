import java.util.Set;
import java.util.TreeSet;

public class Sets {
	public static void main(String[] args) {
		Set<Person> persons = new TreeSet<>();
		persons.add(new Person("John", 20));
		persons.add(new Person("Liza", 16));
		persons.add(new Person("Mat", 36));
		persons.add(new Person("Fred", 55));

	}

}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Persion{" + "name=" + name + '\'' + ", age=" + age + '}';
	}
}
