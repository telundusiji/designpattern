package site.teamo.learning.designpattern.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StatisticsTask extends Task {
    @Override
    public void start() {
        setStatus("UP");
        log.info("StatisticsTask is working...");
    }

    @Override
    public void stop() {
        log.info("StatisticsTask is shutdown!");
        setStatus("DOWN");
    }
}
