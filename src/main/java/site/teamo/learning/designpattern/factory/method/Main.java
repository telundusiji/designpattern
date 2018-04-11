package site.teamo.learning.designpattern.factory.method;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args){
        UserFactory adminUserFactory = new AdminUserFactory();
        AdminUser adminUser = (AdminUser) adminUserFactory.createUser();
        log.info(adminUser.toString());

        UserFactory normalUserFactory = new NormalUserFactory();
        NormalUser normalUser = (NormalUser) normalUserFactory.createUser();
        log.info(normalUser.toString());

        UserFactory anonymousUserFactory = new AnonymousUserFactory();
        AnonymousUser anonymousUser = (AnonymousUser) anonymousUserFactory.createUser();
        log.info(anonymousUser.toString());
    }
}
