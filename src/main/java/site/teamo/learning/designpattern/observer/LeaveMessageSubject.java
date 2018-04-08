package site.teamo.learning.designpattern.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by haoco on 2018/4/7.
 */
public class LeaveMessageSubject {
    List<Observer> observers;
    private Message message;
    public LeaveMessageSubject() {
        observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public boolean removeObserver(Observer observer){
        return observers.remove(observer);
    }

    public void notifyObserver(){
        for(Observer o : observers){
            o.update(message);
        }
    }

    public void setMessage(Message message) {
        this.message = message;
        notifyObserver();
    }
}
