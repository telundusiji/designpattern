package site.teamo.learning.designpattern.factory.abstractf;

import lombok.extern.slf4j.Slf4j;
import site.teamo.learning.designpattern.factory.abstractf.credentials.Credentials;
import site.teamo.learning.designpattern.factory.abstractf.permission.SystemPermission;
import site.teamo.learning.designpattern.factory.abstractf.user.User;

@Slf4j
public class Main {
    public static void main(String[] args){
        Factory adminAccountFactory = new AdminAccountFactory();
        addAccountToSystem(adminAccountFactory.createUser(),adminAccountFactory.createCredentials(),adminAccountFactory.createSystemPermission());

        Factory normalAccountFactory = new NormalAccountFactory();
        addAccountToSystem(normalAccountFactory.createUser(),normalAccountFactory.createCredentials(),normalAccountFactory.createSystemPermission());

        Factory anonymousAccountFactory = new AnonymousAccountFactory();
        addAccountToSystem(anonymousAccountFactory.createUser(),anonymousAccountFactory.createCredentials(),anonymousAccountFactory.createSystemPermission());

    }

    public static void addAccountToSystem(User user, Credentials credentials, SystemPermission systemPermission){
        log.info("用户：{}，认证方式：{}，权限：{}",user.toString(),credentials.toString(),systemPermission.getPermission());
    }
}
