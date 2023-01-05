package com.BookStore.dao;

import com.BookStore.pojo.book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface bookIntf {
    public List<book> BookAll();
    public book SelectOne(int id);
    public boolean InsertBook(book Book);
    public boolean DeleteData(int id);
    public boolean UpdateData(book Book);
}
