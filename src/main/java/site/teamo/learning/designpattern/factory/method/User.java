package site.teamo.learning.designpattern.factory.method;

import lombok.Data;


@Data
public abstract class User {
    private int id;
    private String name;
    private String role;
    private long active;
    private boolean status;

    public abstract void init(int id,String name,long active);
}
