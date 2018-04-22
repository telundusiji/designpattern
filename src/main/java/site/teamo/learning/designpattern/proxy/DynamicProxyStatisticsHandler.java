package site.teamo.learning.designpattern.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@Slf4j
public class DynamicProxyStatisticsHandler implements InvocationHandler {

    private RealStatistics realStatistics;

    public DynamicProxyStatisticsHandler(RealStatistics realStatistics) {
        this.realStatistics = realStatistics;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(realStatistics,args);
        after();
        return null;
    }

    private void before() {
        log.info("统计前，开启需要统计的服务");
    }

    private void after() {
        log.info("统计结束，关闭服务！");
    }
}
