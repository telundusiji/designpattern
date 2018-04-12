package site.teamo.learning.designpattern.factory.abstractf.user;

public class AdminUser extends User {
    @Override
    public void init(int id, String name, long active) {
        setId(id);
        setName(name);
        setRole("管理员");
        setActive(active);
    }
}
