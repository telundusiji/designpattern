package site.teamo.learning.designpattern.bridge;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Slf4j
public class FtpFileSource implements FileSource {

    private List<String> files;

    public FtpFileSource() {
        files = new ArrayList<>();
        files.add("test1.txt");
        files.add("test2.txt");
        files.add("test4.txt");
        files.add("test17.txt");
        files.add("test3.txt");
        files.add("test15.txt");
        files.add("test8.txt");
        files.add("other.txt");
    }

    @Override
    public List<String> searchFile(String name) {
        log.info("登录Ftp服务器...");
        log.info("开始搜索...");
        List<String> result = new ArrayList<>();
        for(String s : files){
            if(s.contains(name)){
                result.add(s);
            }
        }
        log.info("搜索完成!");
        return result;

    }

    @Override
    public List<String> list() {
        log.info("登录Ftp服务器...");
        log.info("获取所有文件完毕!");
        return files;
    }

    @Override
    public void delete(String name) {
        log.info("登录Ftp服务器...");
        log.info("开始删除文件...");
        Iterator<String> iterator = files.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals(name)){
                iterator.remove();
            }
        }
        log.info("删除完成");
    }


}
