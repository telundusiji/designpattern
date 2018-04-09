package site.teamo.learning.designpattern.singleton;

/**
 * Created by haoco on 2018/4/9.
 */
public class LazySingletonTypeTow {
    private LazySingletonTypeTow(){}
    private static class innerClass{
        public final static LazySingletonTypeTow singleton = new LazySingletonTypeTow();
    }
    public static LazySingletonTypeTow getInstance(){
        return innerClass.singleton;
    }
}
