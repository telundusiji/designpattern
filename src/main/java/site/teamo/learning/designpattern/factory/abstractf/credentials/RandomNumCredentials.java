package site.teamo.learning.designpattern.factory.abstractf.credentials;

public class RandomNumCredentials extends Credentials {
    @Override
    public void initCredentials() {
        setCredentials(createRandomNum());
    }

    @Override
    public boolean confirm(String credentials) {
        if(credentials==null){
            return false;
        }
        return credentials.equals(getCredentials());
    }

    private String createRandomNum(){
        return ""+(int)(Math.random()*9000+1000);
    }
}
