package site.teamo.learning.designpattern.responsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TeamLeader extends Handler{
    @Override
    public boolean handleRequest(String task) {
        if("task".equals(task)){
            log.info("组长批准{}",task);
            return getHandler().handleRequest(task);
        }
        log.info("组长驳回{}请求",task);
        return false;
    }
}
