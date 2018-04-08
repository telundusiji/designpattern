package site.teamo.learning.designpattern.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by haoco on 2018/4/7.
 */
@Slf4j
public class ReplyEmail implements Observer {
    public void update(Message message) {
        log.info("留言:{},{},{},发送邮件...",message.id,message.name,message.content);
    }
}
