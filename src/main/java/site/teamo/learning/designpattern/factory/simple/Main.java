package site.teamo.learning.designpattern.factory.simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        AdminUser adminUser = SimpleFactory.createUser(SimpleFactory.Type.ADMIN, AdminUser.class);
        log.info(adminUser.toString());
        NormalUser normalUser = SimpleFactory.createUser(SimpleFactory.Type.NORMAL, NormalUser.class);
        log.info(normalUser.toString());
        AnonymousUser anonymousUser = SimpleFactory.createUser(SimpleFactory.Type.ANONYMOUS, AnonymousUser.class);
        log.info(anonymousUser.toString());
    }
}
