package com.pdm.top.service.user;

import com.pdm.top.domain.user.User;

public interface UserService {

    //登陆
    public User login(User user);

    //修改密码
    public void editPassword(User user);
}
