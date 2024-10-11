package behavioral.mediator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import behavioral.mediator.colleague.User;

//Concrete Mediator
public class ChatRoom implements ChatRoomMediator {

    public void showMessage(User user, String message) {
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String sender = user.getName();
        System.out.println(time + " [" + sender + "]: " + message);
    }
}
