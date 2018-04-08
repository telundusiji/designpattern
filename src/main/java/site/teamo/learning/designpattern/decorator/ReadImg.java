package site.teamo.learning.designpattern.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by haoco on 2018/4/8.
 */
@Slf4j
public class ReadImg extends ImgEdit {
    private String path;
    public ReadImg(String path){
        this.path = path;
    }
    public void handle() {
        log.info("图片{}读取中...",path);
        log.info("读取完成！");
    }
}
