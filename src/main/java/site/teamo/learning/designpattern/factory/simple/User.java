package site.teamo.learning.designpattern.factory.simple;

import lombok.Data;


@Data
public abstract class User {
    private String name;
    private String role;

    public abstract void init();
}
