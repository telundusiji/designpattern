package site.teamo.learning.designpattern.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args){
        Control control = new Control();
        Task cleanTask = new CleanTask();
        Task statisticsTask = new StatisticsTask();

        control.setCommand(new TaskStartCommand(cleanTask));
        control.action();
        log.info(cleanTask.toString());

        control.setCommand(new TaskStopCommand(cleanTask));
        control.action();
        log.info(cleanTask.toString());

        control.setCommand(new TaskStartCommand(statisticsTask));
        control.action();
        log.info(statisticsTask.toString());

        control.setCommand(new TaskStopCommand(statisticsTask));
        control.action();
        log.info(statisticsTask.toString());
    }
}
