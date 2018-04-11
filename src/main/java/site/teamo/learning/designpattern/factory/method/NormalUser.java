package site.teamo.learning.designpattern.factory.method;


public class NormalUser extends User {

    @Override
    public void init(int id, String name, long active) {
        setId(id);
        setName(name);
        setRole("一般用户");
        setActive(active);
    }
}
