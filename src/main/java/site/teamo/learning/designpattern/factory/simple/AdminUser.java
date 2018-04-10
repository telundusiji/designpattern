package site.teamo.learning.designpattern.factory.simple;

public class AdminUser extends User {
    @Override
    public void init() {
        setName("临时用户：张三");
        setRole("管理员");
    }
}
