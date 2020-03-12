package utils;

public class StringUtils {

    public static boolean isEmpty(String para){
        if (null != para){
            return org.apache.commons.lang3.StringUtils.isEmpty(para);
        }
        return false;
    }

    public static boolean isNotEmpty(String para){
        return !isEmpty(para);
    }

    public static boolean equalsIgnoreCase(String str1, String str2){
        return org.apache.commons.lang3.StringUtils.equalsIgnoreCase(str1, str2);
    }
}
