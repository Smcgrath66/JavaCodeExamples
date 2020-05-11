import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		Integer integer = Optional.of(new C()).map(C::getB).map(B::getA).map(A::getValue).orElse(9);

		System.out.println(integer);
	}

}

class A {
	private int value = 10;

	public int getValue() {
		return value;
	}
}

class B {
	private A a;

	public A getA() {
		return a;
	}
}

class C {
	private B b;

	public B getB() {
		return b;
	}
}
