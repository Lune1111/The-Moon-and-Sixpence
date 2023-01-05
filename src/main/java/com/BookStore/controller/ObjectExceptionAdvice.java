package com.BookStore.controller;

import com.BookStore.exceptionAdvice.BusinessExceptionAdvice;
import com.BookStore.exceptionAdvice.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ObjectExceptionAdvice extends RuntimeException{
    @ExceptionHandler(SystemException.class)
    public Result UnSystemException(SystemException ex){
        return new Result(ex.getCode(),ex.getMessage());
    }
    @ExceptionHandler(BusinessExceptionAdvice.class)
    public Result UnBusinessException(BusinessExceptionAdvice ex){
        return new Result(ex.getCode(),ex.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public Result UnException(Exception ex){
        return new Result(Code.UnKnowException,"服务器无法响应稍后再试");
    }
}
