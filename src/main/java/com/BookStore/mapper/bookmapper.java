package com.BookStore.mapper;

import com.BookStore.pojo.book;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface bookmapper {
  @Select("select * from Book")
  List<book> SelectBook();
  @Select("select * from Book where id=#{id}")
  book SelectOne(@Param("id")int Id);
  @Insert("insert into Book(bookname,price,writer)value(#{BookName},#{Price},#{Writer})")
  public boolean InsertBook(book Book);
  @Delete("delete from Book where id=#{id}")
  public boolean DeleteData(@Param("id")int Id);
  @Update("update Book set bookname=#{BookName},price=#{Price},writer=#{Writer} where id=#{Id}")
  public boolean UpdateData(book Book);
}
