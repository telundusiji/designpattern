package site.teamo.learning.designpattern.state;

public interface ArticleState {
    void publish(Article article);
    void ban(Article article);
    void pick(Article article);
    void sticky(Article article);
    void off(Article article);
    void delete(Article article);
}
