package site.teamo.learning.designpattern.template;

public class Main {
    public static void main(String[] args){
        ResourceTemplate img = new ImgResource();
        img.execute();

        ResourceTemplate text = new TextResource();
        text.execute();
    }
}
