package site.teamo.learning.designpattern.factory.simple;

public class NormalUser extends User {
    @Override
    public void init() {
        setName("临时用户：李四");
        setRole("一般");
    }
}
