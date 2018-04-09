package site.teamo.learning.designpattern.singleton;

/**
 * Created by haoco on 2018/4/9.
 */
public class LazySingletonTypeOne {
    private static LazySingletonTypeOne singleton = null;
    private LazySingletonTypeOne(){}
    public static LazySingletonTypeOne getInstance(){
        if(singleton == null){
            synchronized (LazySingletonTypeOne.class){
                if(singleton == null){
                    singleton = new LazySingletonTypeOne();
                }
            }
        }
        return singleton;
    }
}
