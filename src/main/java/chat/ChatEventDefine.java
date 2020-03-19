package chat;

public class ChatEventDefine {

    private ChatInit chatInit;
    private IChatEvent chatEvent;
    private IChatMethod chatMethod;

    public ChatEventDefine(ChatInit chatInit, IChatEvent chatEvent, IChatMethod chatMethod) {
        this.chatInit = chatInit;
        this.chatEvent = chatEvent;
        this.chatMethod = chatMethod;
        min();
        quit();
        chatInit.move();
    }

    private void min(){
        chatInit.group_bar_chat_min.setOnAction(event -> {
            chatInit.setIconified(true);
        });
        chatInit.group_bar_friend_min.setOnAction(event -> {
            chatInit.setIconified(true);
        });
    }

    private void quit(){
        chatInit.group_bar_chat_close.setOnAction(event -> {
            chatEvent.doQuit();
            chatInit.close();
            System.exit(0);
        });
        chatInit.group_bar_friend_close.setOnAction(event -> {
            chatEvent.doQuit();
            chatInit.close();
            System.exit(0);
        });
    }
}
