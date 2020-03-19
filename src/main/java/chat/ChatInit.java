package chat;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;
import view.UIObject;

import java.io.IOException;

public abstract class ChatInit extends UIObject {

    private static final String RESOURCE_NAME="/chat/chat.fxml";

    public String userId;
    public String userNickName;
    public String userHead;

    public IChatEvent chatEvent;

    public TextArea txt_input;
    public Button group_bar_chat_min;
    public Button group_bar_friend_min;
    public Button group_bar_chat_close;
    public Button group_bar_friend_close;


    public ChatInit(IChatEvent chatEvent) {
        this.chatEvent = chatEvent;
        try{
            root = FXMLLoader.load(getClass().getResource(RESOURCE_NAME));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        setScene(scene);
        initStyle(StageStyle.TRANSPARENT);
        setResizable(false);
        obtain();
        initView();
        initEventDefine();
    }

    private void obtain(){
        txt_input = $("txt_input", TextArea.class);
        group_bar_chat_min = $("group_bar_chat_min",Button.class);
        group_bar_friend_min = $("group_bar_friend_min",Button.class);
        group_bar_chat_close = $("group_bar_chat_close",Button.class);
        group_bar_friend_close = $("group_bar_friend_close",Button.class);
    }

    public Parent root(){
        return super.root;
    }

}
