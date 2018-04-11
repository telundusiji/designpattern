package site.teamo.learning.designpattern.factory.method;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class UserFactory {
    public abstract User createUser();
    public void userActive(User user){
        user.setStatus(true);
        log.info("{}激活成功！",user.toString());
    }
}
