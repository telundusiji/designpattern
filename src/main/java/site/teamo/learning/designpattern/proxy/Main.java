package site.teamo.learning.designpattern.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Proxy;

@Slf4j
public class Main {
    public static void main(String[] args){

        //静态代理
        log.info("--------------静态代理-------------");
        Statistics statistics = new ProxyStatistics(new RealStatistics());
        statistics.statistics();

        //动态代理
        log.info("--------------动态代理-------------");
        RealStatistics realStatistics = new RealStatistics();
        Statistics dynamicStatistics =
                (Statistics) Proxy.newProxyInstance(
                        realStatistics.getClass().getClassLoader(),
                        realStatistics.getClass().getInterfaces(),
                        new DynamicProxyStatisticsHandler(realStatistics)
                );
        dynamicStatistics.statistics();
    }
}
