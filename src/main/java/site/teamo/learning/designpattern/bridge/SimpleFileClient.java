package site.teamo.learning.designpattern.bridge;

import lombok.extern.slf4j.Slf4j;

import java.util.List;


@Slf4j
public class SimpleFileClient extends FileClient {

    public SimpleFileClient(FileSource fileSource) {
        super(fileSource);
    }

    @Override
    public void list() {
        List<String> list = getFileSource().list();
        for(String s: list){
            log.info("文件：{}",s);
        }
    }

    @Override
    public void search(String name) {
        List<String> list = getFileSource().searchFile(name);
        log.info("---------------搜索{}结果--------------",name);
        for(String s: list){
            log.info("文件：{}",s);
        }
    }

    @Override
    public void delete(String name) {
        getFileSource().delete(name);
        log.info("--------------{}文件删除-----------",name);
    }
}
