package site.teamo.learning.designpattern.composite;

import lombok.Data;

@Data
public abstract class Organization {
    private String name;

    public Organization(String name) {
        this.name = name;
    }

    public abstract void add(Organization organization);
    public abstract void print();
}
