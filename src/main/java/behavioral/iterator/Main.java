package behavioral.iterator;

public class Main {
	public static void main(String[] args) {

		UserManagement userManagement = new UserManagement();
		userManagement.addUser(new User("user hi kehde", "1"));
		userManagement.addUser(new User("doosra  user hi kehde", "2"));
		userManagement.addUser(new User("teesra user hi kehde", "3"));
		userManagement.addUser(new User("chautha user hi kehde", "4"));

		CustomIterator itr = userManagement.getIterator();
		while (itr.hasNext()) {
			User user = (User) itr.next();
			System.out.println(user.getName());
		}
	}

}
