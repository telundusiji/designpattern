package site.teamo.learning.designpattern.iterator;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Slf4j
@Data
public class ArticlePackage{

    private List<Article> originalArticle;
    private List<Article> reprintArticle;

    public ArticlePackage() {
        originalArticle = new ArrayList<>();
        reprintArticle = new ArrayList<>();
    }

    public void addArticle(Article article){
        if(article == null){
            return;
        }
        if("original".equals(article.getType())){
            originalArticle.add(article);
            return;
        }
        if("reprint".equals(article.getType())){
            reprintArticle.add(article);
            return;
        }
    }

    public Iterator getIterator(){
        return new ArticleIterator();
    }

    private class ArticleIterator implements Iterator<Article>{

        private Iterator<Article> originalIterator;
        private Iterator<Article> reprintIterator;

        public ArticleIterator() {
            originalIterator = originalArticle.iterator();
            reprintIterator = reprintArticle.iterator();
        }

        @Override
        public boolean hasNext() {
            if(originalIterator.hasNext()||reprintIterator.hasNext()){
                return true;
            }
            return false;
        }

        @Override
        public Article next() {
            if(originalIterator.hasNext()){
                return originalIterator.next();
            }else if (reprintIterator.hasNext()){
                return reprintIterator.next();
            }else {
                return null;
            }
        }
    }
}
