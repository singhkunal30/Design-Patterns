package creational.builder;

public class Main {

	public static void main(String[] args) {
		Person p = Person.builder().setEmailId("abcd@gmail.com").setName("builder hi kehde").build();
		
		System.out.println(p.toString());
	}
}
