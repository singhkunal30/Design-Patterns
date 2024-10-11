package behavioral.mediator;

import behavioral.mediator.colleague.ChatUser;
import behavioral.mediator.colleague.User;

public class Main {

    public static void main(String[] args) {
        ChatRoomMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "Alice");
        User user2 = new ChatUser(chatRoom, "Bob");

        user1.send("Hello, Bob!");
        user2.send("Hi, Alice!");
    }
}
