package utils;

import Exception.BussinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class CommonValidate {

    private static final Logger logger = LoggerFactory.getLogger(CommonValidate.class);

    /**
     * 校验参数是否合法
     *
     * @param paramMap
     * @param variable
     */
    public static String validateVariable(Map<String, Object> paramMap, String variable) {
        if (paramMap.containsKey(variable)) {
            Object para = paramMap.get(variable);
            if (null != para) {
                String paraStr = para.toString();
                if (StringUtils.isNotEmpty(paraStr)) {
                    return paraStr;
                }
            }
        }
        logger.info("calling validateVariable wrong with paramMap = {}", new Object[]{});
        throw new BussinessException("err.common." + variable + ".notLegal", "validate parameter " + variable + " error");
    }
}
