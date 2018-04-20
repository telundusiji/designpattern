package site.teamo.learning.designpattern.state;

import lombok.Data;

@Data
public class Article{

    private String title;

    public final static BanState banState = new BanState();

    public final static NormalState normalState = new NormalState();

    public final static ReadyState readyState = new ReadyState();

    public final static StickyState stickyState = new StickyState();

    public final static DeleteState deleteState = new DeleteState();

    private ArticleState currentState;

    public void setState(ArticleState articleState){
        currentState = articleState;
    }

    public void publish() {
        currentState.publish(this);
    }

    public void ban() {
        currentState.ban(this);
    }

    public void pick() {
        currentState.pick(this);
    }

    public void sticky() {
        currentState.sticky(this);
    }

    public void off() {
        currentState.off(this);
    }

    public void delete() {
        currentState.delete(this);
    }
}
