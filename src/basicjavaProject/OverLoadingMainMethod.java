package basicjavaProject;

/*You can overload the main() method, but only public static void main(String[] args) 
will be used when your class is launched by the JVM
But the program doesn't execute the overloaded main method when you run your program, 
you have to call the overloaded main method from the actual main method.
that means main method acts as an entry point for the java interpreter to start the execute of the application. 
where as a loaded main need to be called from main
*/
public class OverLoadingMainMethod {

	public static void main(String[] args) {
		System.out.println("static void main(String[] args)");

		main("Jitendra");
		main("Jitendra","Gupta");
	}

	public static void main(String args1) {
		System.out.println("static void main(String args1)");

	}

	public static void main(String arg1,String args2) {
		System.out.println("static void main(String arg1,String args2)");

	}

		
}
