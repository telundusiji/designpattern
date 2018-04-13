package site.teamo.learning.designpattern.command;

public class TaskStopCommand extends Command {
    private Task task;

    public TaskStopCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        task.stop();
    }
}
