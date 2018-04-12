package site.teamo.learning.designpattern.factory.abstractf;

import site.teamo.learning.designpattern.factory.abstractf.credentials.Credentials;
import site.teamo.learning.designpattern.factory.abstractf.credentials.PasswordCredentials;
import site.teamo.learning.designpattern.factory.abstractf.permission.AllSystemPermission;
import site.teamo.learning.designpattern.factory.abstractf.permission.SystemPermission;
import site.teamo.learning.designpattern.factory.abstractf.user.AdminUser;
import site.teamo.learning.designpattern.factory.abstractf.user.User;

public class AdminAccountFactory implements Factory {
    @Override
    public User createUser() {
        AdminUser adminUser = new AdminUser();
        adminUser.init((int)(Math.random()*100),"admin",1000*60*10);
        return adminUser;
    }

    @Override
    public Credentials createCredentials() {
        Credentials credentials = new PasswordCredentials();
        credentials.initCredentials();
        return credentials;
    }

    @Override
    public SystemPermission createSystemPermission() {
        return new AllSystemPermission();
    }
}
