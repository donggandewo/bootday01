package com.baizhi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@NoArgsConstructor
public class User {
    private String username;
    @Id
    private int id;
    private String password;
}
