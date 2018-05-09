package site.teamo.learning.designpattern.responsibility;

import lombok.Data;

@Data
public abstract class Handler {
    private Handler handler;

    public abstract boolean handleRequest(String task);
}
