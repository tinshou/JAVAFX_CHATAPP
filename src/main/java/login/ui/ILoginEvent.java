package login.ui;

import java.util.Map;

public interface ILoginEvent {

    /**
     * 登录校验
     * @param userName
     * @param userPassword
     */
    public Map<String, Object> doLoginCheck(String userName, String userPassword);
}
