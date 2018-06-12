package com.entor.action;

import com.entor.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld extends ActionSupport {
    private static final Logger LOGGER = LogManager.getLogger();
    private MessageStore messageStore;

    @Override
    public String execute() throws Exception{
        messageStore = new MessageStore() ;
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        LOGGER.info("getMessageStore invoked!");
        return messageStore;
    }
}
