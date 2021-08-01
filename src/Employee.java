
public class Employee {
	int empId;// 12345
	String name;// Rakesh
	float salary;// 100000.20
	String company;

	// method without any return type
	public void getEmpId() {
		empId = 12345;
		// System.out.println("Employed Id"+empId);
	}

	// method with return type
	public int getEmpIdenty() {
		empId = 987654;
		// System.out.println("some values");
		return empId;
	}

	/**
	 * Method to get emp salary
	 * @return salary
	 */
	public float getEmpSalary() {
		salary = 1000.20f;
		return salary;
	}

	/**
	 * Method to get Random integer in between two values
	 * @param maximum
	 * @param minimum
	 * @return interger
	 */
	public int getRandomInteger(int maximum, int minimum) {
		return ((int) (Math.random() * (maximum - minimum))) + minimum;
	}

	public static void main(String[] args) {

		// <class name> objectname = new <classname>();
		Employee e = new Employee();// memory
		e.getEmpId();
		int value = e.getEmpIdenty();
		System.out.println("method returning value-->" + value);
		System.out.println("method returning value-->" + e.getEmpIdenty());
		float empSal = e.getEmpSalary();
		System.out.println("salary with bonus " + (empSal + 1000));
		
		int randomNumber = e.getRandomInteger(100, 75);
		System.out.println("Random number is -->"+randomNumber);
		

	}

}
