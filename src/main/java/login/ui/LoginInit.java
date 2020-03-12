package login.ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;
import view.UIObject;

import java.io.IOException;


/**
 * 初始化登录窗口
 */
public abstract class LoginInit extends UIObject {

    private static final String RESOURCE_NAME = "/login/login.fxml";

    protected ILoginEvent loginEvent;

    public Button login_min;//最小化
    public Button login_close;//关闭
    public Button login_button;//登录按钮
    public TextField login_username;//用户名输入框
    public PasswordField login_password;//密码输入框

     LoginInit(ILoginEvent loginEvent){
         this.loginEvent = loginEvent;
        try {
            root = FXMLLoader.load(getClass().getResource(RESOURCE_NAME));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        setScene(scene);
        initStyle(StageStyle.TRANSPARENT);
        setResizable(false);
        this.getIcons().add(new Image("/chat/img/bear.png"));
        obtain();
        initView();
        initEventDefine();
     }

    private void obtain(){
        login_min = $("login_min", Button.class);
        login_close = $("login_close", Button.class);
        login_button = $("login_button", Button.class);
        login_username = $("login_username", TextField.class);
        login_password = $("login_password", PasswordField.class);
    }

}
