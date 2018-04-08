package site.teamo.learning.designpattern.strategy;

import site.teamo.learning.designpattern.strategy.color.BlueColor;


/**
 * Created by haoco on 2018/4/6.
 */
public class Main {
    public static void main(String[] args){
        Theme theme = new Theme();
        theme.show();
        System.out.println("**************");
        theme.setColor(new BlueColor());
        theme.show();
    }
}
