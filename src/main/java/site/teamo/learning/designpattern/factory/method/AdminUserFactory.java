package site.teamo.learning.designpattern.factory.method;

public class AdminUserFactory extends UserFactory {
    @Override
    public User createUser() {
        AdminUser adminUser = new AdminUser();
        adminUser.init((int)(Math.random()*100),"admin",1000*60*10);
        userActive(adminUser);
        return adminUser;
    }
}
