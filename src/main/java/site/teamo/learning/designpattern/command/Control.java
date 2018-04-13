package site.teamo.learning.designpattern.command;

public class Control {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void action() {
        if(command==null){
            return;
        }
        this.command.execute();
    }
}
