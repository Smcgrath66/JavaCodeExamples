
public class AdvancedOverloading {

	public static void main(String[] args) {
		new F.G().methodG();
	}
}

class F {
	static void methodF() {
		System.out.println("method A()");
	}

	static class G {
		void methodG() {
			System.out.println("method B() ");
			methodF();
		}
	}
}