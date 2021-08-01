/**
 * Class to perform few basic activities
 * 
 * @author Chinna.Putha
 *
 */
public class SampleProgram {

	// variables
	int a;// variable declaration; a is integer variable
	int b;
	boolean isEligle;

	// method
	public void addition() {
		a = 4;// variable intialization
		b = 20;
		int c = a + b;
		System.out.println("C value--->" + c);
	}

	public void sayHello() {
		System.out.println("Welcome to all");
	}

	public static void main(String[] args) {
		// <class name> objectname = new <classname>();
		SampleProgram sp = new SampleProgram(); //sp(object)  is class variable(class variable is known as onbject)
		sp.sayHello();
		sp.addition();
	}

}
