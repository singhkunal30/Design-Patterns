package creational.abstractfactory;

public class MainClass {
	public static void main(String[] args) {
		Employee e = EmployeeFactory.getEmployee(new DeveloperFactory());

		System.out.println(e.salary() + " " + e.name());
	}
}
