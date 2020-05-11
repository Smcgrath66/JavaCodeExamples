
public class FunctionalExample {

	public static void main(String[] args) {
		MyFunctionalInterface myFunctionalInterface = () -> System.out.println("Do the work");
		myFunctionalInterface.doWork();
		myFunctionalInterface.postponeWork();
	}

}

@FunctionalInterface
interface MyFunctionalInterface {
	void doWork();

	default void postponeWork() {
		System.out.println("Postpone the work");
	}
}