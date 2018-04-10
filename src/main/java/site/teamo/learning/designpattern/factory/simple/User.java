package site.teamo.learning.designpattern.factory.simple;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public abstract class User {
    private String name;
    private String role;

    public abstract void init();
}
