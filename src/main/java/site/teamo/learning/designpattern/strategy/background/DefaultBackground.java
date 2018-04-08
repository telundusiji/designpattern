package site.teamo.learning.designpattern.strategy.background;

import site.teamo.learning.designpattern.strategy.background.ThemeBackground;

/**
 * Created by haoco on 2018/4/6.
 */
public class DefaultBackground implements ThemeBackground {
    public void background() {
        System.out.println("默认的背景");
    }
}
