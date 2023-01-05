package com.BookStore.dao.Impl;

import com.BookStore.controller.Code;
import com.BookStore.dao.bookIntf;
import com.BookStore.exceptionAdvice.BusinessExceptionAdvice;
import com.BookStore.exceptionAdvice.SystemException;
import com.BookStore.mapper.bookmapper;
import com.BookStore.pojo.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class bookImpl implements bookIntf {
    @Autowired
    private bookmapper bok;

    @Override
    public List<book> BookAll() {
        try{
            List<book> list=bok.SelectBook();
            return list;
        }catch (ArithmeticException ex){
            throw new SystemException(Code.SystemException,"数据请求繁忙，稍后再试");
        }
    }

    @Override
    public book SelectOne(int id) {
        return bok.SelectOne(id);
    }

    @Override
    public boolean InsertBook(book Book) {
        try{
            if( bok.InsertBook(Book)==true){
                System.out.println("执行成功");
                return true;
            }
            return false;
        }catch(ArithmeticException ex){
            throw new BusinessExceptionAdvice(Code.BusinessException,"数据传输有误，请重新尝试");
        }
    }

    @Override
    public boolean DeleteData(int id) {
        if(bok.DeleteData(id)==true){
            System.out.println("删除成功");
            return true;
        }
        return false;
    }

    @Override
    public boolean UpdateData(book Book) {
        if(bok.UpdateData(Book)==true){
            System.out.println("修改成功");
            return true;
        }
        return false;
    }
}
