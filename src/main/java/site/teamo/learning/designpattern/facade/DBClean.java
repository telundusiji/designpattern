package site.teamo.learning.designpattern.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DBClean {
    public void clean(){
        log.info("数据库缓存清理成功");
    }
}
