package site.teamo.learning.designpattern.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BanState implements ArticleState {
    @Override
    public void publish(Article article) {

    }

    @Override
    public void ban(Article article) {

    }

    @Override
    public void pick(Article article) {
        log.info("文章：{}----解封成功！",article.getTitle());
        article.setCurrentState(Article.normalState);
    }

    @Override
    public void sticky(Article article) {

    }

    @Override
    public void off(Article article) {

    }

    @Override
    public void delete(Article article) {
        log.info("文章：{}----删除成功！",article.getTitle());
        article.setCurrentState(Article.deleteState);
    }
}
