package login.ui;

public interface ILoginEvent {

    /**
     * 登录校验
     * @param userName
     * @param userPassword
     */
    public void doLoginCheck(String userName, String userPassword);
}
