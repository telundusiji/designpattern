package site.teamo.learning.designpattern.bridge;

import lombok.Data;

@Data
public abstract class FileClient {

    private FileSource fileSource;

    public FileClient(FileSource fileSource) {
        this.fileSource = fileSource;
    }

    public abstract void list();

    public abstract void search(String name);

    public abstract void delete(String name);
}
