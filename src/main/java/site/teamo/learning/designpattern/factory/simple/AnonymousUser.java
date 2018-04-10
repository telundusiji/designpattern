package site.teamo.learning.designpattern.factory.simple;

public class AnonymousUser extends User {
    @Override
    public void init() {
        setName("临时用户：XX");
        setRole("匿名用户");
    }
}
