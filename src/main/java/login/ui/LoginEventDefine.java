package login.ui;

public class LoginEventDefine {

    private LoginInit loginInit;
    private ILoginEvent loginEvent;
    private ILoginMethod loginMethod;

    public LoginEventDefine(LoginInit loginInit, ILoginEvent loginEvent, ILoginMethod loginMethod) {
        this.loginInit = loginInit;
        this.loginEvent = loginEvent;
        this.loginMethod = loginMethod;

        loginInit.move();
        min();
        quit();
        doEventLogin();
    }

    /**
     * 最小化窗口
     */
    private void min(){
        loginInit.login_min.setOnAction(event -> {
            loginInit.setIconified(true);
        });
    }

    /**
     * 退出事件
     */
    private void quit(){
        loginInit.login_close.setOnAction(event -> {
            loginInit.close();
            System.exit(0);
        });
    }

    /**
     * 登录操作
     */
    private void doEventLogin(){
        loginInit.login_button.setOnAction(event -> {
                loginEvent.doLoginCheck(loginInit.login_username.getText(), loginInit.login_password.getText());
        });
    }
}
