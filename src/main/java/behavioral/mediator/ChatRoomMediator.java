package behavioral.mediator;

import behavioral.mediator.colleague.User;

public interface ChatRoomMediator {
	void showMessage(User user, String message);
}
