package site.teamo.learning.designpattern.factory.abstractf.user;

public class AnonymousUser extends User{
    @Override
    public void init(int id, String name, long active) {
        setId(id);
        setName(name);
        setRole("匿名用户");
        setActive(active);
    }
}
