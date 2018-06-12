package com.entor.action;

import com.entor.model.UserModel;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<UserModel> {
    private static final Logger LOGGER = LogManager.getLogger(UserAction.class);

    private UserModel userModel;

    @Override
    public UserModel getModel() {
        if (userModel == null) {
            userModel = new UserModel();
        }
        return userModel;
    }

    public static Logger getLOGGER() {
        return LOGGER;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public String login() {

        LOGGER.info("loginName:{}", userModel.getLoginName());
        LOGGER.info("password:{}", userModel.getPassword());
        return "logon";
    }

    public String regist() {

        LOGGER.info("loginName:{}", userModel.getLoginName());
        LOGGER.info("password:{}", userModel.getPassword());
        LOGGER.info("birth", userModel.getBirth());

        return "regist";
    }

    public String helloWorld() {
        return "helloworld";
    }
}
