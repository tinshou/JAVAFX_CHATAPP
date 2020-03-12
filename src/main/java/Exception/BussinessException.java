package Exception;


public class BussinessException extends RuntimeException {

    private String errorMg;
    private String errorCode;
    private Object[] errorParam;

    public BussinessException(String errorMg, String errorCode) {
        this.errorMg = errorMg;
        this.errorCode = errorCode;
    }

    public BussinessException(String errorMg, String errorCode, Object[] errorParam) {
        this.errorMg = errorMg;
        this.errorCode = errorCode;
        this.errorParam = errorParam;
    }

    public String getErrorMg() {
        return errorMg;
    }

    public void setErrorMg(String errorMg) {
        this.errorMg = errorMg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public Object[] getErrorParam() {
        return errorParam;
    }

    public void setErrorParam(Object[] errorParam) {
        this.errorParam = errorParam;
    }
}
