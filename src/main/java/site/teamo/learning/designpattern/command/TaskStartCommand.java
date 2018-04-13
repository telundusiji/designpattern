package site.teamo.learning.designpattern.command;

public class TaskStartCommand extends Command {
    private Task task;

    public TaskStartCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        task.start();
    }
}
