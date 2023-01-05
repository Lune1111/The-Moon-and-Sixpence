package com.BookStore.exceptionAdvice;

public class BusinessExceptionAdvice extends RuntimeException{
    private Integer code;


    public BusinessExceptionAdvice(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessExceptionAdvice(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public BusinessExceptionAdvice(Integer code, Throwable cause) {
        super(cause);
        this.code = code;
    }

    public BusinessExceptionAdvice(Integer code, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
