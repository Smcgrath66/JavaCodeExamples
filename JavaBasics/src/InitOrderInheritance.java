
public class InitOrderInheritance {

	public static void main(String[] args) {
		D d = new E();
		d.doWork();
	}

}

class D {
	public D() {
		System.out.println("constructor A()");
	}

	static {
		System.out.println("static A");
	}

	protected void doWork() {
		System.out.println("doWork() A()");
	}
}

class E extends D {
	public E() {
		System.out.println("contructor B()");
	}

	static {
		System.out.println("static B");
	}

	protected void doWork() {
		System.out.println("doWork() B()");
	}
}
