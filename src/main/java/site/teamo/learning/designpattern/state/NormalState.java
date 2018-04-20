package site.teamo.learning.designpattern.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NormalState implements ArticleState {
    @Override
    public void publish(Article article) {

    }

    @Override
    public void ban(Article article) {
        log.info("文章：{}----封禁成功！",article.getTitle());
        article.setCurrentState(Article.banState);
    }

    @Override
    public void pick(Article article) {

    }

    @Override
    public void sticky(Article article) {
        log.info("文章：{}----置顶成功！",article.getTitle());
        article.setCurrentState(Article.stickyState);
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
