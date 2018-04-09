package site.teamo.learning.designpattern.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by haoco on 2018/4/9.
 */
@Slf4j
public class Main {
    public static void main(String[] args){
        //HungerSingleton
        HungerSingleton hungerSingleton1 = HungerSingleton.getInstance();
        HungerSingleton hungerSingleton2 = HungerSingleton.getInstance();
        log.info("hungerSingleton1==hungerSingleton2:{}",hungerSingleton1.equals(hungerSingleton2));

        //LazySingletonTypeOne
        LazySingletonTypeOne lazySingletonTypeOne1 = LazySingletonTypeOne.getInstance();
        LazySingletonTypeOne lazySingletonTypeOne2 = LazySingletonTypeOne.getInstance();
        log.info("lazySingletonTypeOne1==lazySingletonTypeOne2:{}",lazySingletonTypeOne1.equals(lazySingletonTypeOne2));

        //LazySingletonTypeTow
        LazySingletonTypeTow lazySingletonTypeTow1 = LazySingletonTypeTow.getInstance();
        LazySingletonTypeTow lazySingletonTypeTow2 = LazySingletonTypeTow.getInstance();
        log.info("lazySingletonTypeTow1==lazySingletonTypeTow2:{}",lazySingletonTypeTow1.equals(lazySingletonTypeTow2));
    }
}
