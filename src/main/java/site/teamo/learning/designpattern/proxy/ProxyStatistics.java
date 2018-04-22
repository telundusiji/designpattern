package site.teamo.learning.designpattern.proxy;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProxyStatistics implements Statistics{

    private RealStatistics realStatistics;

    public ProxyStatistics(RealStatistics realStatistics){
        this.realStatistics = realStatistics;
    }

    @Override
    public void statistics() {
        log.info("统计前，开启需要统计的服务");
        realStatistics.statistics();
        log.info("统计结束，关闭服务！");
    }
}
