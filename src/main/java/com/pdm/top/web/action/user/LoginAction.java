package com.pdm.top.web.action.user;

import com.opensymphony.xwork2.ModelDriven;
import com.pdm.top.domain.user.User;
import com.pdm.top.web.action.base.BaseAction;
import org.apache.struts2.ServletActionContext;

/**
 * 用户登录
 */
public class LoginAction extends BaseAction implements ModelDriven<User>{
    //模型驱动
    private User user = new User();

    public User getModel() {
        return user;
    }

    //用户登录
    public String execute() {
        String checkCodeSeesion = (String) ServletActionContext.getRequest().getSession().getAttribute("key");
        if(checkCodeSeesion == null || !checkCodeSeesion.equals(checkcode)) {
            this.addActionError("验证码错误");
            return INPUT;
        }
        //验证成功，比较用户名和密码
        User loginUser = userService.login(user);
        if(loginUser == null) {
            this.addActionError("用户名或密码错误");
            return INPUT;
        } else {
            ServletActionContext.getRequest().getSession().setAttribute("user", loginUser);
            return SUCCESS;
        }
    }

    //接收验证码（属性驱动）
    private String checkcode;

    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }
}
