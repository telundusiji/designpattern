package site.teamo.learning.designpattern.iterator;

import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;
import java.util.Random;

@Slf4j
public class Main {
    public static void main(String[] args){
        ArticlePackage articlePackage = new ArticlePackage();
        Random r = new Random();
        String[] type = new String[]{"original","reprint"};
        for(int i = 0;i< 20;i++){
            articlePackage.addArticle(Article.builder().type(type[r.nextInt(2)]).build());
        }
        Iterator iterator = articlePackage.getIterator();
        while (iterator.hasNext()){
            log.info(iterator.next().toString());
        }
    }
}
