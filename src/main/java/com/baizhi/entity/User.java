package com.baizhi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;

@Data
@NoArgsConstructor
public class User {
    private String username;
    @Id
    @KeySql(useGeneratedKeys = true)
    private int id;
    private String password;
    private int status;
}
