package site.teamo.learning.designpattern.strategy;

import site.teamo.learning.designpattern.strategy.background.DefaultBackground;
import site.teamo.learning.designpattern.strategy.background.ThemeBackground;
import site.teamo.learning.designpattern.strategy.color.DefaultColor;
import site.teamo.learning.designpattern.strategy.color.ThemeColor;


/**
 * Created by haoco on 2018/4/6.
 */
public class Theme {
    private ThemeColor color;
    private ThemeBackground background;

    public Theme() {
        this.color = new DefaultColor();
        this.background = new DefaultBackground();
    }

    public Theme(ThemeColor color, ThemeBackground background) {
        this.color = color;
        this.background = background;
    }

    public ThemeColor getColor() {
        return color;
    }

    public void setColor(ThemeColor color) {
        this.color = color;
    }

    public ThemeBackground getBackground() {
        return background;
    }

    public void setBackground(ThemeBackground background) {
        this.background = background;
    }

    public void show() {
        color.color();
        background.background();
    }
}
