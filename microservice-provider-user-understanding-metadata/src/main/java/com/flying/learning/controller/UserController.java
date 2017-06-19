/*
 Created by Walker on 2017/6/9.
 Revision History:
 Date          Who              Version      What
 2017/6/9      Walker           0.1.0        Created. 
*/
package com.flying.learning.controller;

import com.flying.learning.entity.User;
import com.flying.learning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User findOne = this.repository.findOne(id);
        return findOne;
    }
}
