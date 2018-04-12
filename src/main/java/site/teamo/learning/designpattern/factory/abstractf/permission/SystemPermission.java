package site.teamo.learning.designpattern.factory.abstractf.permission;

import lombok.Data;

@Data
public abstract class SystemPermission {
    private boolean read;
    private boolean write;
    private boolean execute;

    public SystemPermission(boolean read, boolean write, boolean execute) {
        this.read = read;
        this.write = write;
        this.execute = execute;
    }

    public String getPermission(){
        return (read?"r":"-")+(write?"w":"-")+(execute?"x":"-");
    }
}
