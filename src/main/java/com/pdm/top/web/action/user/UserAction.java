package com.pdm.top.web.action.user;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.pdm.top.domain.user.User;
import com.pdm.top.web.action.base.BaseAction;
import org.apache.struts2.ServletActionContext;

import java.util.HashMap;
import java.util.Map;

public class UserAction extends BaseAction implements ModelDriven<User> {
    //模型驱动
    private User user = new User();

    public User getModel() {
        return user;
    }

    // 修改密码
    public String editPassword() {
        User loginUser = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
        user.setId(loginUser.getId());

        try {
            userService.editPassword(user);
            //修改成功
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("result", "success");
            map.put("msg", "修改密码成功");
            ActionContext.getContext().put("map", map);
        } catch (Exception e) {
            //修改失败
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("result", "failed");
            map.put("msg", "修改密码失败" + e.getMessage());
            ActionContext.getContext().put("map", map);
        }
        return "editpasswordSUCCESS";
    }
}
