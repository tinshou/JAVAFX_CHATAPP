package login.bussiness;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.CommonValidate;
import utils.StringUtils;
import java.util.HashMap;
import java.util.Map;

public class LoginService {

    private static final Logger logger = LoggerFactory.getLogger(LoginService.class);

    private static final String USERNAME="admin";
    private static final String PASSWORD="123456";

    public Map<String, Object> loginAction(Map<String, Object> paramMap){
        logger.info("invoke method logAction with paramMap = {}",new Object[]{paramMap});
        String username = CommonValidate.validateVariable(paramMap, "username");
        String password = CommonValidate.validateVariable(paramMap, "password");

        Map<String, Object> resultMap = new HashMap<>();
        boolean loginCorrect = false;

        if (StringUtils.equalsIgnoreCase(USERNAME, username) &&
                StringUtils.equalsIgnoreCase(PASSWORD, password)){
            loginCorrect = true;
        }

        resultMap.put("isLogin", loginCorrect);
        return resultMap;
    }
}
