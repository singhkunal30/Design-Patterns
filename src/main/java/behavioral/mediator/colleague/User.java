package behavioral.mediator.colleague;

import behavioral.mediator.ChatRoomMediator;

public abstract class User {
	protected ChatRoomMediator mediator;
	protected String name;

	public User(ChatRoomMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void send(String message);
}
