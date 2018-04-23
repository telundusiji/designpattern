package site.teamo.learning.designpattern.bridge;

public class Main {
    public static void main(String[] args){
        SimpleFileClient simpleFileClient = new SimpleFileClient(new FtpFileSource());

        simpleFileClient.list();

        simpleFileClient.search("test");

        simpleFileClient.setFileSource(new LocalFileSource());

        simpleFileClient.list();

        simpleFileClient.delete("test3.txt");


        MultifunctionalFileClient multifunctionalFileClient = new MultifunctionalFileClient(new FtpFileSource());

        multifunctionalFileClient.listWithSort();

    }
}
