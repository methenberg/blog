package com.hjh.service;

import com.hjh.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
