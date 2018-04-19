package site.teamo.learning.designpattern.composite;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Department extends Organization{

    private List<Organization> organizations;

    public Department(String name) {
        super(name);
        organizations = new ArrayList<>();
    }

    @Override
    public void add(Organization organization) {
        organizations.add(organization);
    }

    @Override
    public void print() {
        log.info("部门：{}",getName());
        for(Organization o: organizations){
            o.print();
        }
    }
}
