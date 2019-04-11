package com.baizhi.service.impl;

import com.baizhi.dao.BookDao;
import com.baizhi.entity.Book;
import com.baizhi.service.BookService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("bookService")
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public List<Book> selectAll(int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex,pageSize);
        PageInfo<Book> pageInfo=new PageInfo<>(bookDao.selectAll());
        return pageInfo.getList();
    }
}
