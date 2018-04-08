package site.teamo.learning.designpattern.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by haoco on 2018/4/8.
 */
@Slf4j
public class ImgZoom extends ImgDecorator {
    public ImgZoom(ImgEdit imgEdit) {
        super(imgEdit);
    }

    public void handle() {
        getImgEdit().handle();
        log.info("缩放操作...");
        log.info("缩放操作完成");
    }
}
