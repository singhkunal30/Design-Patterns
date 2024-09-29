package creational.factory;

public class MainClass {
	public static void main(String[] args) {
		Employee e = EmployeeFactory.getEmployee("developer");
		
		System.out.println(e.salary()+ " " + e.name());
	}
}
