package com.baizhi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;


import javax.persistence.Id;
@Data
@NoArgsConstructor
public class Book {
    @KeySql(useGeneratedKeys = true)
    @Id
    private int id;
    private String name;
    private String author;
}