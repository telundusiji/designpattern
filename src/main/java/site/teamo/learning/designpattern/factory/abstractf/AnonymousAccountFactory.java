package site.teamo.learning.designpattern.factory.abstractf;

import site.teamo.learning.designpattern.factory.abstractf.credentials.Credentials;
import site.teamo.learning.designpattern.factory.abstractf.credentials.NoneCredentials;
import site.teamo.learning.designpattern.factory.abstractf.permission.RSystemPermission;
import site.teamo.learning.designpattern.factory.abstractf.permission.SystemPermission;
import site.teamo.learning.designpattern.factory.abstractf.user.AnonymousUser;
import site.teamo.learning.designpattern.factory.abstractf.user.User;

public class AnonymousAccountFactory implements Factory{
    @Override
    public User createUser() {
        AnonymousUser anonymousUser = new AnonymousUser();
        anonymousUser.init((int)(Math.random()*100+200),"anonymous",1000*60*1);
        return anonymousUser;
    }

    @Override
    public Credentials createCredentials() {
        return new NoneCredentials();
    }

    @Override
    public SystemPermission createSystemPermission() {
        return new RSystemPermission();
    }
}
