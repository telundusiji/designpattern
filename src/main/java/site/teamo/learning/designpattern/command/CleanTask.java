package site.teamo.learning.designpattern.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CleanTask extends Task{
    @Override
    public void start() {
        setStatus("UP");
        log.info("CleanTask is working...");
    }

    @Override
    public void stop() {
        log.info("CleanTask is shutdown!");
        setStatus("DOWN");
    }

}
