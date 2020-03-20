package chat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChatEventDefine {

    private static final Logger logger = LoggerFactory.getLogger(ChatEventDefine.class);

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
        barChat();
        barFriend();
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


    public void barFriend(){
        chatInit.bar_friend.setOnAction(event -> {
            switchBarChat(false);
            switchBarFriend(true);
        });
    }

    public void barChat(){
        chatInit.bar_chat.setOnAction(event -> {
            switchBarFriend(false);
            switchBarChat(true);
        });
    }


    private void switchBarChat(boolean toggle){
        if (toggle){
            // 显示聊天窗口，变化图标
            chatInit.group_bar_chat.setVisible(true);
            chatInit.bar_chat.setStyle("-fx-background-image: url('/chat/img/system/chat_2.png')");
            logger.info("显示聊天窗口");
        }else{
            // 关闭聊天窗口，变化图标
            chatInit.group_bar_chat.setVisible(false);
            chatInit.bar_chat.setStyle("-fx-background-image: url('/chat/img/system/chat_0.png')");
            logger.info("关闭聊天窗口");
        }
    }

    private void switchBarFriend(boolean toggle){
        if (toggle){
            // 显示好友窗口，变化图标
            chatInit.group_bar_friend.setVisible(true);
            chatInit.bar_friend.setStyle("-fx-background-image: url('/chat/img/system/friend_2.png')");
            logger.info("显示好友窗口");
        }else{
            // 关闭好友窗口，变化图标
            chatInit.group_bar_friend.setVisible(false);
            chatInit.bar_friend.setStyle("-fx-background-image: url('/chat/img/system/friend_0.png')");
            logger.info("关闭好友窗口");
        }
    }
}
