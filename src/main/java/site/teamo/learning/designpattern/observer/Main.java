package site.teamo.learning.designpattern.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.Observer;

/**
 * Created by haoco on 2018/4/7.
 */
public class Main {
    public static void main(String[] args){
        LeaveMessageSubject leaveMessageSubject = new LeaveMessageSubject();
        leaveMessageSubject.addObserver(new ChangeDB());
        leaveMessageSubject.addObserver(new ReplyEmail());
        leaveMessageSubject.addObserver(new NotifyMessage());
        leaveMessageSubject.setMessage(Message.builder().id(1).name("张三").email("xxxx@qq.com").content("请教你一个问题").build());
    }
}
