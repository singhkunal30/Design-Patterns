package creational.factory;

public class EmployeeFactory {

	public static Employee getEmployee(String employee) {
		if (employee.trim().equalsIgnoreCase("developer")) {
			return new Developer();
		} else if (employee.trim().equalsIgnoreCase("analyst")) {
			return new Analyst();
		}
		return null;
	}

}
