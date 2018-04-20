package site.teamo.learning.designpattern.state;

public class Main {
    public static void main(String[] args){
        Article article = new Article();
        article.setTitle("设计模式入门：状态模式");
        article.setCurrentState(Article.readyState);

        article.publish();
        article.sticky();
        article.off();
        article.ban();
        article.pick();
        article.delete();
    }
}
