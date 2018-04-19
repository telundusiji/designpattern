package site.teamo.learning.designpattern.composite;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Team extends Organization {

    public Team(String name) {
        super(name);
    }

    @Override
    public void add(Organization organization) {
        throw new RuntimeException("团队下不可添加组织");
    }

    @Override
    public void print() {
        log.info("团队：{}",getName());
    }
}
