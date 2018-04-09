package site.teamo.learning.designpattern.singleton;

/**
 * Created by haoco on 2018/4/9.
 */
public class HungerSingleton {
    private final static HungerSingleton singleton = new HungerSingleton();
    private HungerSingleton(){}
    public static HungerSingleton getInstance(){
        return singleton;
    }

}
