package behavioral.iterator;

import java.util.List;

public class CustomIteratorImpl implements CustomIterator {
	
	private List<User> list;
	private int length;
	private int position = 0;

	public CustomIteratorImpl(List<User> userList) {
		this.list = userList;
		this.length = userList.size();
	}

	public boolean hasNext() {
		if(position >= length || list.get(position) == null) {
			return false;
		}
		return true;
	}

	public User next() {
		User user = list.get(position);
		position++;
		return user;
	}

}
