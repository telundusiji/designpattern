package site.teamo.learning.designpattern.factory.abstractf;

import site.teamo.learning.designpattern.factory.abstractf.credentials.Credentials;
import site.teamo.learning.designpattern.factory.abstractf.credentials.RandomNumCredentials;
import site.teamo.learning.designpattern.factory.abstractf.permission.RWSystemPermission;
import site.teamo.learning.designpattern.factory.abstractf.permission.SystemPermission;
import site.teamo.learning.designpattern.factory.abstractf.user.NormalUser;
import site.teamo.learning.designpattern.factory.abstractf.user.User;

public class NormalAccountFactory implements Factory {
    @Override
    public User createUser() {
        NormalUser normalUser = new NormalUser();
        int id = (int)(Math.random()*100+100);
        normalUser.init(id,String.valueOf(id),1000*60*5);
        return normalUser;
    }

    @Override
    public Credentials createCredentials() {
        Credentials credentials = new RandomNumCredentials();
        credentials.initCredentials();
        return credentials;
    }

    @Override
    public SystemPermission createSystemPermission() {
        return new RWSystemPermission();
    }
}
