package javaPracticeProgram;

class abc {
	abc get() {
		return this;

	}
}

public class Covariant_Example extends abc {

	Covariant_Example get() {
		return this;

	}

	public static void main(String[] args) {
		new Covariant_Example().get().message();
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}
}
