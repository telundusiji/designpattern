package site.teamo.learning.designpattern.template;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public abstract class ResourceTemplate {

    private String type;

    protected abstract void create();

    private final void uploadToFTP(){
        String serverHost = null;
        if("text".equals(type)){
            serverHost = "text.ftp.xxxx.com";
        }else if("img".equals(type)){
            serverHost = "img.ftp.xxxx.com";
        }else {
            throw new RuntimeException();
        }
        log.info("上传到FTP服务器({})成功！",serverHost);
    }

    private final void saveToDB(){
        log.info("保存到数据库成功！");
    }

    private final void clean(){
        log.info("清理本地缓存成功！");
    }

    public final void execute(){
        create();
        uploadToFTP();
        saveToDB();
        clean();
    }
}
