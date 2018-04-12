package site.teamo.learning.designpattern.factory.abstractf.credentials;

import lombok.Data;

@Data
public abstract class Credentials {

    private String credentials;

    public abstract void initCredentials();

    public abstract boolean confirm(String credentials);
}
