package site.teamo.learning.designpattern.factory.abstractf.credentials;

import java.util.UUID;

public class PasswordCredentials extends Credentials {
    @Override
    public void initCredentials() {
        setCredentials(createPassword());
    }

    @Override
    public boolean confirm(String credentials) {
        if(credentials==null){
            return false;
        }
        return credentials.equals(getCredentials());
    }

    private String createPassword(){
        return UUID.randomUUID().toString();
    }
}
