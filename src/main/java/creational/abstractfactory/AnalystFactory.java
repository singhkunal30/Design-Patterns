package creational.abstractfactory;

// Factory for creating Developer instances
public class AnalystFactory implements EmployeeAbstractFactory {

	public Employee createEmployee() {
		return new Analyst();
	}

}
