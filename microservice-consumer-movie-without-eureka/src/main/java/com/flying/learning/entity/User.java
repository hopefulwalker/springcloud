/*
 Created by Walker on 2017/6/9.
 Revision History:
 Date          Who              Version      What
 2017/6/9      Walker           0.1.0        Created. 
*/
package com.flying.learning.entity;

import java.math.BigDecimal;

public class User {
    private Long Id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
