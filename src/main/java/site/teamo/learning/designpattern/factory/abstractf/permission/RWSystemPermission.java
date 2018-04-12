package site.teamo.learning.designpattern.factory.abstractf.permission;

public class RWSystemPermission extends SystemPermission {
    public RWSystemPermission() {
        super(true, true, false);
    }
}
