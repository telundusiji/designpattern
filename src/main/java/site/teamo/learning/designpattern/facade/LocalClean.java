package site.teamo.learning.designpattern.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LocalClean {
    public void clean(){
        log.info("本地缓存清理成功");
    }
}
