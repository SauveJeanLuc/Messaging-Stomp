package com.messaging.stompmessaging.controller;

import com.messaging.stompmessaging.model.Greeting;
import com.messaging.stompmessaging.model.Message;
import org.springframework.web.util.HtmlUtils;

public class GreetingController {

    public Greeting greeting(Message message) throws  Exception{
        Thread.sleep(1000);
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }

}
