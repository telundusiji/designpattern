package site.teamo.learning.designpattern.factory.abstractf.permission;

public class AllSystemPermission extends SystemPermission {
    public AllSystemPermission() {
        super(true, true, true);
    }
}
