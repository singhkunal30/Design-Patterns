package behavioral.mediator.colleague;

import behavioral.mediator.ChatRoomMediator;

//Concrete Colleague
public class ChatUser extends User {

	public ChatUser(ChatRoomMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String message) {
		mediator.showMessage(this, message);
	}
}
