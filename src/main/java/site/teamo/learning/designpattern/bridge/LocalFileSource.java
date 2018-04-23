package site.teamo.learning.designpattern.bridge;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Slf4j
public class LocalFileSource implements FileSource {

    private List<String> files;

    public LocalFileSource() {
        files = new ArrayList<>();
        files.add("test7.txt");
        files.add("test10.txt");
        files.add("test56.txt");
        files.add("test17.txt");
        files.add("test9.txt");
        files.add("test0.txt");
        files.add("test8.txt");
        files.add("other.txt");
    }

    @Override
    public List<String> searchFile(String name) {
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
        return files;
    }

    @Override
    public void delete(String name) {
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
