package site.teamo.learning.designpattern.factory.abstractf;

import site.teamo.learning.designpattern.factory.abstractf.credentials.Credentials;
import site.teamo.learning.designpattern.factory.abstractf.permission.SystemPermission;
import site.teamo.learning.designpattern.factory.abstractf.user.User;

public interface Factory {
    User createUser();

    Credentials createCredentials();

    SystemPermission createSystemPermission();
}
