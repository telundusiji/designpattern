package site.teamo.learning.designpattern.responsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CTO extends Handler {
    @Override
    public boolean handleRequest(String task) {
        if("task".equals(task)){
            log.info("CTO批准{}",task);
            return true;
        }
        log.info("CTO驳回{}请求",task);
        return false;
    }
}
