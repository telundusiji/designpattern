package site.teamo.learning.designpattern.command;

import lombok.Data;

@Data
public abstract class Task {
    private String status;
    public abstract void start();
    public abstract void  stop();
}
