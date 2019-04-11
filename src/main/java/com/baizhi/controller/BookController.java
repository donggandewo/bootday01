package com.baizhi.controller;

import com.baizhi.entity.Book;
import com.baizhi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("selectAll")
    /*@ResponseBody*/
    public String selectAll(ModelMap map,@RequestParam(required = false,defaultValue = "1") int pageIndex, @RequestParam(required = false,defaultValue = "5") int pageSize){
        List<Book> list=bookService.selectAll(pageIndex,pageSize);
        map.addAttribute("list",list);
        return "index";
    }
}