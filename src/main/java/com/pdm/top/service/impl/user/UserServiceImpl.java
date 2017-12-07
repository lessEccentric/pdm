package com.pdm.top.service.impl.user;

import com.pdm.top.domain.user.User;
import com.pdm.top.service.base.BaseService;
import com.pdm.top.service.user.UserService;
import com.pdm.top.utils.MD5Utils;

import java.util.List;

public class UserServiceImpl extends BaseService implements UserService{
    public User login(User user) {
        List<User> list = userDAO.findByNamedQuery("User.login", user.getUsername(), MD5Utils.md5(user.getPassword()));
        return list.isEmpty() ? null : list.get(0);
    }

    public void editPassword(User user) {
        User exist = userDAO.findById(user.getId());
        exist.setPassword(MD5Utils.md5(user.getPassword()));
        userDAO.update(exist);
    }
}
