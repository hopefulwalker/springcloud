/*
 Created by Walker on 2017/6/9.
 Revision History:
 Date          Who              Version      What
 2017/6/9      Walker           0.1.0        Created. 
*/
package com.flying.learning.controller;

import com.flying.learning.entity.User;
import com.flying.learning.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserRepository repository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            UserDetails user = (UserDetails) principal;
            Collection<? extends GrantedAuthority> authorities = user.getAuthorities();
            for (GrantedAuthority authority : authorities) {
                logger.info("Current user:{}, role:{}", user.getUsername(), authority.getAuthority());
            }
        } else {
            logger.info("Principal is not a user details object");
        }
        User findOne = this.repository.findOne(id);
        return findOne;
    }
}
