package login.ui;

import login.bussiness.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class LoginController extends LoginInit implements ILoginMethod{

    private LoginView loginView;
    private LoginEventDefine loginEventDefine;

    @Autowired
    private LoginService loginService;

    @Autowired
    private LoginInit loginInit;

    public LoginController(ILoginEvent loginEvent) {
        super(loginEvent);
    }

    @Override
    public void initView() {
        loginView = new LoginView(this, loginEvent);
    }

    @Override
    public void initEventDefine() {
        loginEventDefine = new LoginEventDefine(this,loginEvent, this);
    }

    @Override
    public void doShow() {
        System.out.println("显示登录窗口。。");
        super.show();
    }

    @Override
    public void doLogin() {
        Map<String, Object> loginParam = new HashMap<String, Object>();
        loginParam.put("username", loginInit.login_username.getText());
        loginParam.put("password", loginInit.login_password.getText());

        Map<String, Object> loginResultMap = loginService.loginAction(loginParam);

        boolean loginStatus = (Boolean) loginResultMap.get("isLogin");
        if (loginStatus){
            System.out.println("登录成功。。");
        }else{
            System.out.println("登录失败。。");
        }
    }
}
