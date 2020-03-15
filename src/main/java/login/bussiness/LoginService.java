package login.bussiness;

import login.ui.ILoginEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import utils.StringUtils;
import java.util.HashMap;
import java.util.Map;

@Service(value = "loginService")
public class LoginService implements ILoginEvent {

    private static final Logger logger = LoggerFactory.getLogger(LoginService.class);

    public static final String USERNAME="admin";
    public static final String PASSWORD="123456";


    @Override
    public Map<String, Object> doLoginCheck(String userName, String userPassword) {
        logger.info("invoke method logAction with userName={}, userPassword = {}",
                new Object[]{userName, userPassword});

        Map<String, Object> resultMap = new HashMap<>();
        boolean loginCorrect = false;

        if (StringUtils.equalsIgnoreCase(USERNAME, userName) &&
                StringUtils.equalsIgnoreCase(PASSWORD, userPassword)){
            System.out.println("登录成功。。。");
            loginCorrect = true;
        }else{
            System.out.println("登录失败。。。");
        }

        resultMap.put("isLogin", loginCorrect);
        return resultMap;
    }
}
