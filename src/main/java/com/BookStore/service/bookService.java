package com.BookStore.service;

import com.BookStore.controller.Code;
import com.BookStore.exceptionAdvice.BusinessExceptionAdvice;
import org.springframework.stereotype.Service;

@Service
public class bookService {
    public void JJService(){
        try{
            System.out.println("159");
        }catch (ArithmeticException ex){
            throw new BusinessExceptionAdvice(Code.BusinessException,"Ero");
        }
    }
}
