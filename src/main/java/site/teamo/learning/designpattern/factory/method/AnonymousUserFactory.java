package site.teamo.learning.designpattern.factory.method;

public class AnonymousUserFactory extends UserFactory{
    @Override
    public User createUser() {
        AnonymousUser anonymousUser = new AnonymousUser();
        anonymousUser.init((int)(Math.random()*100+200),"anonymous",1000*60*1);
        userActive(anonymousUser);
        return anonymousUser;
    }
}
