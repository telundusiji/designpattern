package site.teamo.learning.designpattern.bridge;

import java.util.List;

public interface FileSource {
    List<String> searchFile(String name);
    List<String> list();
    void delete(String name);
}
