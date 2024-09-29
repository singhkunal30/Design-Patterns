package creational.abstractfactory;

// Factory for creating Developer instances
public class DeveloperFactory implements EmployeeAbstractFactory {

	public Employee createEmployee() {
		return new Developer();
	}

}
