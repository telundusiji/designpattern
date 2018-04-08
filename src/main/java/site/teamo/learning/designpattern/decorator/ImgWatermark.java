package site.teamo.learning.designpattern.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by haoco on 2018/4/8.
 */
@Slf4j
public class ImgWatermark extends ImgDecorator {
    public ImgWatermark(ImgEdit imgEdit) {
        super(imgEdit);
    }
    public void handle() {
        getImgEdit().handle();
        log.info("添加水印...");
        log.info("添加水印完成");
    }
}
