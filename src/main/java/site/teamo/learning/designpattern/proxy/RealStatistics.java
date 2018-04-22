package site.teamo.learning.designpattern.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealStatistics implements Statistics {
    @Override
    public void statistics() {
        log.info("开始统计......");
        log.info("统计完成！");
    }
}
