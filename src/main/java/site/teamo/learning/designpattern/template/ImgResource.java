package site.teamo.learning.designpattern.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ImgResource extends ResourceTemplate {
    @Override
    public void create() {
        setType();
        log.info("创建text资源！");
    }

    public void setType(){
        super.setType("img");
    }
}
