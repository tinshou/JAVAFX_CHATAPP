package chat;

public class ChatController extends ChatInit implements IChatMethod {

    private ChatView chatView;
    private ChatEventDefine chatEventDefine;

    public ChatController(IChatEvent chatEvent) {
        super(chatEvent);
    }

    @Override
    public void doShow() {
        super.show();
    }

    @Override
    public void initView() {
        chatView = new ChatView();
    }

    @Override
    public void initEventDefine() {
        chatEventDefine = new ChatEventDefine(this, chatEvent, this);
    }
}
