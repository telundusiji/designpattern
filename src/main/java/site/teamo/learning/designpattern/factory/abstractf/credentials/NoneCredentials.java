package site.teamo.learning.designpattern.factory.abstractf.credentials;

public class NoneCredentials extends Credentials {
    @Override
    public void initCredentials() {

    }

    @Override
    public boolean confirm(String credentials) {
        return true;
    }
}
