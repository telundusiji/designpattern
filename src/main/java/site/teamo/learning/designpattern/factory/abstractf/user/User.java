package site.teamo.learning.designpattern.factory.abstractf.user;

import lombok.Data;

@Data
public abstract class User {
    private int id;
    private String name;
    private String role;
    private long active;

    public abstract void init(int id,String name,long active);
}
