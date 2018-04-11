package site.teamo.learning.designpattern.factory.method;

public class NormalUserFactory extends UserFactory {
    @Override
    public User createUser() {
        NormalUser normalUser = new NormalUser();
        int id = (int)(Math.random()*100+100);
        normalUser.init(id,String.valueOf(id),1000*60*5);
        userActive(normalUser);
        return normalUser;
    }
}
