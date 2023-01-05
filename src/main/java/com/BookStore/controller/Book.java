package com.BookStore.controller;

import com.BookStore.dao.bookIntf;
import com.BookStore.pojo.book;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/book")
public class Book {

    @Autowired
    private bookIntf bok;

    @GetMapping("/{id}")
    public Result SelectOne(@PathVariable Integer id){
        if(bok.SelectOne(id)!=null){
            return new Result(Code.GetSuccess,bok.SelectOne(id),"成功");
        }else {
            return new Result(Code.GetEro,"失败");
        }
    }

    @GetMapping
    public Result Insert(){
        List<book> list = bok.BookAll();

        if(list!=null){
            return new Result(Code.GetSuccess,list,"传输成功");
        }else{
            return new Result(Code.GetEro,"传输失败");
        }
    }

    @PostMapping()
    public Result Number(@RequestBody book Book){
        if(bok.InsertBook(Book)==true){
            return new Result(Code.PostSuccess,"成功");
        }else{
            return new Result(Code.PostEro,"失败");
        }
    }
    @DeleteMapping("/{id}")
    public Result DeleteDate(@PathVariable Integer id){
       if(bok.DeleteData(id)==true){
           return new Result(Code.DeleteSuccess,"成功");
       }else
           return new Result(Code.DeleteEro,"失败");
    }
    @PutMapping()
    public Result UpdateData(@RequestBody book Book){
        if(bok.UpdateData(Book)==true){
            return new Result(Code.UpdateSuccess,"成功");
        }else{
            return new Result(Code.UpdateEro,"失败");
        }
    }
}
